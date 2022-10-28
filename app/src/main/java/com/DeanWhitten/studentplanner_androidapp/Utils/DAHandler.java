package com.DeanWhitten.studentplanner_androidapp.Utils;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.DeanWhitten.studentplanner_androidapp.Model.Term;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DAHandler extends SQLiteOpenHelper {
    private static final String DB_NAME = "plannerDBg";
    private static final int DB_VERSION = 1;
    private static final String LOG = DAHandler.class.getName();

    //      Table Names
    private static final String TABLE_TERMS = "terms";
    private static final String TABLE_COURSES = "courses";
    private static final String TABLE_ASSESSMENTS = "assessments";
    //      Common Columns
    private static final String COL_ID = "id";
    private static final String COL_TITLE = "title";
    private static final String COL_START = "start";
    private static final String COL_END = "end";
    //      Course Specific columns
    private static final String COL_STATUS = "status";
    private static final String COL_TERM_ID_KEY = "term_id";
    //      Assessment Specific columns
    private static final String COL_TYPE = "type";
    private static final String COL_COURSE_ID_KEY = "course_id";

   private static final String CREATE_TABLE_TERMS =
           "CREATE TABLE " + TABLE_TERMS +
                   "(" + COL_ID + " INTEGER PRIMARY KEY," +
                   COL_TITLE + " TEXT," +
                   COL_START + " DATETIME," +
                   COL_END + " DATETIME" + ")";

    private static final String CREATE_TABLE_COURSES =
            "CREATE TABLE " + TABLE_TERMS +
                    "(" + COL_ID + " INTEGER PRIMARY KEY," +
                    COL_TITLE + " TEXT," +
                    COL_START + " DATETIME," +
                    COL_END + " DATETIME," +
                    COL_STATUS + " TEXT" +
                    COL_TERM_ID_KEY + " INTEGER" + ")";

    private static final String CREATE_TABLE_ASSESSMENTS =
            "CREATE TABLE " + TABLE_TERMS +
                    "(" + COL_ID + " INTEGER PRIMARY KEY," +
                    COL_TITLE + " TEXT," +
                    COL_START + " DATETIME," +
                    COL_END + " DATETIME," +
                    COL_TYPE + " TEXT" +
                    COL_COURSE_ID_KEY + " INTEGER" + ")";

    public DAHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //creates tables
        db.execSQL(CREATE_TABLE_TERMS);
        db.execSQL(CREATE_TABLE_COURSES);
        db.execSQL(CREATE_TABLE_ASSESSMENTS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //on update drop old tables
        String dropQuery = "DROP TABLE IF EXISTS ";
        db.execSQL(dropQuery + TABLE_TERMS);
        db.execSQL(dropQuery + TABLE_COURSES);
        db.execSQL(dropQuery + TABLE_ASSESSMENTS);

        //create new tables
        onCreate(db);
    }

    /*Terms DAs ***********************************************************************************/
    /*CREATE*/
    public long createTerm(Term term, long[] termIDs) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(COL_TITLE, term.getTitle());
        values.put(COL_START, term.getStart());
        values.put(COL_END, term.getEnd());
        // insert row
        long termRow = db.insert(TABLE_TERMS, null, values);

        return termRow;
    }

    /*READ*/
    public List<Term> readAllTerms() {
        List<Term> terms = new ArrayList<Term>();
        String selectQuery = "SELECT  * FROM " + TABLE_TERMS;

        Log.e(LOG, selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                @SuppressLint("Range") Term td = new Term(
                        c.getInt(c.getColumnIndex(COL_ID)),
                        c.getString(c.getColumnIndex(COL_TITLE)),
                        LocalDateTime.parse(c.getString(c.getColumnIndex(COL_START))),
                        LocalDateTime.parse(c.getString(c.getColumnIndex(COL_END)))
                );
                // adding to task list
                terms.add(td);
            } while (c.moveToNext());
        }

        return terms;
    }
    /*UPDATE*/
    /*DELETE*/

    /*Courses DAs *********************************************************************************/
    /*CREATE*/
    /*READ*/
    /*UPDATE*/
    /*DELETE*/

    /*Assessments DAs *****************************************************************************/
    /*CREATE*/
    /*READ*/
    /*UPDATE*/
    /*DELETE*/
}
