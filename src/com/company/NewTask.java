package com.company;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class NewTask {
    private String name;
    private String dueDate;
    private String details;
    private boolean completed;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

    public NewTask(Menu menu) {
    }

    public NewTask(String name, String dueDate, String details, boolean completed, SimpleDateFormat dateFormat) {
        this.name = name;
        this.dueDate = dueDate;
        this.details = details;
        this.completed = completed;
        this.dateFormat = dateFormat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }
}
