package com.DeanWhitten.studentplanner_androidapp.Model;

import java.time.LocalDateTime;

public class Course {
    private String title;
    private LocalDateTime start;
    private LocalDateTime end;
    private Status courseStatus;


    enum Status{
        IN_PROGRESS,
        COMPLETED,
        DROPPED,
        PLAN_TO_TAKE
    }

    Course(String title, LocalDateTime start,  LocalDateTime end, Status courseStatus){
        this.setTitle(title);
        this.setStart(start);
        this.setEnd(end);
        this.setCourseStatus(courseStatus);
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
}
