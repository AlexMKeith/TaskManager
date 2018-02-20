package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Tasks {

    public final Menu menu;
    protected List<NewTask> listOfTasks = new ArrayList<>();
    protected List<NewTask> checkedoutGames = new ArrayList<>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:mm");

    public Tasks(Menu menu) {
        this.menu = menu;
    }
}
