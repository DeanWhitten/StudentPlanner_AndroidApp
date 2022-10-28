package com.DeanWhitten.studentplanner_androidapp.Model;

import java.time.LocalDateTime;

public class Course {
    private int id;
    private String title;
    private LocalDateTime start;
    private LocalDateTime end;
    private Status courseStatus;
    private int termID;

    enum Status{
        IN_PROGRESS,
        COMPLETED,
        DROPPED,
        PLAN_TO_TAKE
    }

    Course(int id, String title, LocalDateTime start, LocalDateTime end, Status courseStatus, int termID){
        this.setId(id);
        this.setTitle(title);
        this.setStart(start);
        this.setEnd(end);
        this.setCourseStatus(courseStatus);
        this.setTermID(termID);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public Status getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(Status courseStatus) {
        this.courseStatus = courseStatus;
    }

    public int getTermID() {
        return termID;
    }

    public void setTermID(int termID) {
        this.termID = termID;
    }

}
