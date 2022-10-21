package com.DeanWhitten.studentplanner_androidapp.Model;

import java.time.LocalDateTime;

public class Assessment {
    private String title;
    private LocalDateTime start;
    private LocalDateTime end;
    private AssessmentType type;



    enum AssessmentType{
        OBJECTIVE,
        ASSESSMENT
    }

    Assessment(String title, LocalDateTime start, LocalDateTime end, AssessmentType type){
        this.setTitle(title);
        this.setStart(start);
        this.setEnd(end);
        this.setType(type);
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
}
