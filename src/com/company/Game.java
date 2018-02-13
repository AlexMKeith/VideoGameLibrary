package com.company;

public class Game extends Library {

    private String title;
    private String dueDate;

    public Game(Menu menu) {
        super(menu);
    }

    public Game(String title) {
        this.title = title;
        dueDate = "";

    }

    public Game(Menu menu, String dueDate) {
        super(menu);
        this.dueDate = dueDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }
}
