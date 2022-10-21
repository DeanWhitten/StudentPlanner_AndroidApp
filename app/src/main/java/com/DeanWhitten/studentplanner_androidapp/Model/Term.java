package com.DeanWhitten.studentplanner_androidapp.Model;

import java.time.LocalDateTime;

public class Term {
    private String title;
    private LocalDateTime start;
    private LocalDateTime end;

    Term(String title, LocalDateTime start, LocalDateTime end){
        this.setTitle(title);
        this.setStart(start);
        this.setEnd(end);
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
}
