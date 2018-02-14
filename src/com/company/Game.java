package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Game {

    private String title;
    private String dueDate;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    public Game(Menu menu) {
    }

    public Game(String title) {
        this.title = title;
        dueDate = "";

    }

    public Game(Menu menu, String dueDate) {
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
