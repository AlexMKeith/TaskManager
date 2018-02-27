package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Tasks {

    public final Menu menu;
    protected List<NewTask> listOfTasks = new ArrayList<>();
    protected List<NewTask> completedTasks = new ArrayList<>();
    protected List<NewTask> uncompletedTasks = new ArrayList<>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:mm");

    public Tasks(Menu menu) {
        this.menu = menu;
    }

    protected void addTask (NewTask newTask) {
        listOfTasks.add(newTask);
        uncompletedTasks.add(newTask);
        menu.startMenu();
    }
    protected void viewTasks() {

        int position = 1;

        for (int i = 0; i < listOfTasks.size(); i++) {
            System.out.println(position + ". " + listOfTasks.get(i).getName());
            position++;

        }
    }
    protected void viewCompleteTasks() {

        int position = 1;

        for (int i = 0; i < completedTasks.size(); i++) {
            System.out.println(position + ". " + completedTasks.get(i).getName());
            position++;

        }
    }
    protected void viewUncompleteTasks() {

        int position = 1;

        for (int i = 0; i < uncompletedTasks.size(); i++) {
            System.out.println(position + ". " + uncompletedTasks.get(i).getName());
            position++;

        }
    }
    protected void removeTask(int taskIndex) {
        listOfTasks.remove(taskIndex);
        uncompletedTasks.remove(taskIndex);
        completedTasks.remove(taskIndex);
        taskIndex -= taskIndex;
        System.out.println("This task has been removed from your task manager.");
        menu.startMenu();
    }
    protected void completionStatus(boolean taskIndex) {
        taskIndex ^= true;
        menu.startMenu();
    }
    protected void selectTask(int taskIndex) {

    }
}
