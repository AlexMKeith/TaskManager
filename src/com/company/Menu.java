package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);
    private Tasks tasks = new Tasks(this);

    public void startMenu() {

        System.out.println("Welcome to your task manager, what would you like to do? \n" +
                "1. Create a new task \n" +
                "2. List all tasks (More options in here) \n" +
                "3. Exit");

        switch (input.nextLine()) {
            case "1":
                System.out.println("You have chosen to create a new task. \n" +
                        "What is the name of this task?");
                input.nextLine();
                NewTask newTask = new NewTask(input.nextLine());
                tasks.addTask(newTask);
                System.out.println("You have added the task " + newTask.getName() + " with the details of " + newTask.getDetails() + " and the due date of " + newTask.getDueDate());
                break;
            case "2":
                System.out.println("You have chosen to see all tasks.");
                tasks.viewTasks();
                System.out.println("Would you like to see more options, Y or N?");
                input.nextLine();
                if (input.nextLine().toUpperCase().equals("Y")) {
                    System.out.println("What would you like to change? \n" +
                            "1. List only uncompleted tasks \n" +
                            "2. List only completed tasks \n" +
                            "3. View a task's details (More options in here) \n" +
                            "4. Exit");
                    input.nextLine();
                    firstInnerSwitch();
                } else {
                    System.out.println("You have not chosen anything, returning you to the main menu.");
                    startMenu();
                }
                startMenu();
                break;
            case "3":
                System.exit(0);
        }
    }
    public void firstInnerSwitch() {
        switch (input.nextLine()) {
            case "1":
                tasks.viewUncompleteTasks();
            case "2":
                tasks.viewCompleteTasks();
            case "3":
                //View details here
                System.out.println("Would you like to change any details, Y or N?");
                input.nextLine()
                        if (input.nextLine().toUpperCase().equals("Y")) {
                    System.out.println("Which details would like to change");
                        }

        }
    }
    public void secondInnerSwitch() {
        switch (input.nextLine()) {

        }
    }
}