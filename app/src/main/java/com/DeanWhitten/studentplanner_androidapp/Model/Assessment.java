package com.DeanWhitten.studentplanner_androidapp.Model;

import java.time.LocalDateTime;

public class Assessment {
    private int id;
    private String title;
    private LocalDateTime start;
    private LocalDateTime end;
    private AssessmentType type;
    private int courseID;

    enum AssessmentType{
        OBJECTIVE,
        ASSESSMENT
    }

    Assessment(int id, String title, LocalDateTime start, LocalDateTime end, AssessmentType type, int courseID){
        this.setId(id);
        this.setTitle(title);
        this.setStart(start);
        this.setEnd(end);
        this.setType(type);
        this.setCourseID(courseID);
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

    public AssessmentType getType() {
        return type;
    }

    public void setType(AssessmentType type) {
        this.type = type;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
}
