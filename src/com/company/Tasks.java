package com.company;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Tasks {

    private NewTask userInput;
    private NewTask newTask = userInput;
    private Scanner input = new Scanner(System.in);
    private final Menu menu;
    private String location;
    private List<NewTask> listOfTasks = new ArrayList<>();
    private List<NewTask> completedTasks = new ArrayList<>();
    private List<NewTask> uncompletedTasks = new ArrayList<>();
    protected SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:mm");

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
    protected void removeUncompleteTask(int taskIndex) {
        listOfTasks.remove(taskIndex);
        uncompletedTasks.remove(taskIndex);
//        completedTasks.remove(taskIndex);
        taskIndex -= taskIndex;
        System.out.println("This task has been removed from your task manager.");
        menu.startMenu();
    }
    protected void removeCompleteTask(int taskIndex) {
        listOfTasks.remove(taskIndex);
        completedTasks.remove(taskIndex);
        taskIndex -= taskIndex;
        System.out.println("This task has been removed from your task manager.");
        menu.startMenu();
    }
    protected void makeComplete(int taskIndex) {
//        location.equals("");
//        selectTask(input.nextInt() - 1);
        taskIndex -= taskIndex;
            uncompletedTasks.add(newTask);
            completedTasks.remove(taskIndex);
        menu.startMenu();
    }
    protected void makeUncomplete(int taskIndex) {
//        selectTask(input.nextInt() - 1);
        taskIndex -= taskIndex;
        completedTasks.add(newTask);
        uncompletedTasks.remove(taskIndex);
        menu.startMenu();
    }
    protected void selectTask(int taskIndex) {
        taskIndex -= taskIndex;

    }
    protected void showDetails(int taskIndex) {
//        NewTask newTask;
        taskIndex -= taskIndex;
        NewTask something = listOfTasks.get(taskIndex);
        // Create a new Task object = arrayName.get(taskIndex)
        System.out.println("You have added the task " + something.getName() + " with the details of " + something.getDetails() + " and the due date of " + something.getDueDate());
    }
    protected void changeCompleteDetails(int taskIndex) {
        System.out.println("Which one would you like to change?");
        viewUncompleteTasks();
        taskIndex -= taskIndex;
        listOfTasks.remove(taskIndex);
        completedTasks.remove(taskIndex);
        System.out.println("What is the name of this task?");
        NewTask newTask = new NewTask(input.nextLine());
        System.out.println("What is the description of this task?");
        newTask.setDetails(input.nextLine());
        Calendar calendar = Calendar.getInstance();
        System.out.println("The date this was created was " + dateFormat.format(calendar.getTime()) + " \n" +
                "What is the due date in the form of MM/DD/YYYY?");
        newTask.setDueDate(input.nextLine());
        listOfTasks.add(newTask);
        completedTasks.add(newTask);
    }
    protected void changeUncompleteDetails(int taskIndex) {
        taskIndex -= taskIndex;
        listOfTasks.remove(taskIndex);
        uncompletedTasks.remove(taskIndex);
        System.out.println("What is the name of this task?");
        NewTask newTask = new NewTask(input.nextLine());
        System.out.println("What is the description of this task?");
        newTask.setDetails(input.nextLine());
        Calendar calendar = Calendar.getInstance();
        System.out.println("The date this was created was " + dateFormat.format(calendar.getTime()) + " \n" +
                "What is the due date in the form of MM/DD/YYYY?");
        newTask.setDueDate(input.nextLine());
        listOfTasks.add(newTask);
        uncompletedTasks.add(newTask);
    }
}