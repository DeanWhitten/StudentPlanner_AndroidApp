package com.DeanWhitten.studentplanner_androidapp.Model;

import java.time.LocalDateTime;

public class Term {
    private int id;
    private String title;
    private LocalDateTime start;
    private LocalDateTime end;

    public Term(int id, String title, LocalDateTime start, LocalDateTime end){
        this.setId(id);
        this.setTitle(title);
        this.setStart(start);
        this.setEnd(end);
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

    public String getStart() {
        return start.toString();
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public String getEnd() {
        return end.toString();
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }
}
