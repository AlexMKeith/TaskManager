package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
                NewTask newTask = new NewTask(input.nextLine());
                System.out.println("What is the description of this task?");
                newTask.setDetails(input.nextLine());
                Calendar calendar = Calendar.getInstance();
                System.out.println("The date this was created was " + tasks.dateFormat.format(calendar.getTime()) +
                "What is the due date in the form of MM/DD/YYYY?");
                newTask.setDueDate(input.nextLine());
                tasks.addTask(newTask);
                System.out.println("You have added the task " + newTask.getName() + " with the details of " + newTask.getDetails() + " and the due date of " + newTask.getDueDate());
                break;
            case "2":
                System.out.println("You have chosen to see all tasks.");
                tasks.viewTasks();
                System.out.println("Would you like to see more options, Y or N?");
//                input.nextLine();
                if (input.nextLine().toUpperCase().equals("Y")) {
                    System.out.println("What would you like to change? \n" +
                            "1. List only uncompleted tasks \n" +
                            "2. List only completed tasks \n" +
                            "3. View a task's details (More options in here) \n" +
                            "4. Exit");
//                    input.nextLine();
                    firstInnerSwitch();
                } else {
                    System.out.println("You have not chosen anything, returning you to the main menu.");
                    startMenu();
                }
                startMenu();
                break;
            case "3":
                System.exit(0);
                default:
                    System.out.println("Please select one of the options.");
                    startMenu();
                    break;
        }
    }
    public void firstInnerSwitch() {
        switch (input.nextLine()) {
            case "1":
                tasks.viewUncompleteTasks();
                break;
            case "2":
                tasks.viewCompleteTasks();
                break;
            case "3":
                System.out.println("Which task's details would you like to see?");
                tasks.viewTasks();

                //View details here
                System.out.println("Would you like to change any details, Y or N?");
//                input.nextLine();
                        if (input.nextLine().toUpperCase().equals("Y")) {
                    System.out.println("Which details would like to change? \n" +
                            "1. Title, Due date, and Description \n" +
                            "2. Mark a task as complete \n" +
                            "3. Mark a task as incomplete \n" +
                            "4. Delete a task \n" +
                            "5. Exit");
//                    input.nextLine();
                    secondInnerSwitch();
                        } else {
                            System.out.println("You have not chosen anything, returning you to the main menu.");
                            startMenu();
                        }
                        break;
            case "4":
                System.exit(0);
                default:
                    System.out.println("Please select one of the options.");
                    break;
        }
    }
    public void secondInnerSwitch() {
        switch (input.nextLine()) {
            case "1":
                //change title
                break;
            case "2":
                System.out.println("Here are a list of your tasks, select the one you want to mark as complete.");
                tasks.viewTasks();
                tasks.selectTask(input.nextInt() - 1);
                tasks.makeComplete(input.nextInt());
                break;
            case "3":
                System.out.println("Here are a list of your tasks, select the one you want to mark as complete.");
                tasks.viewTasks();
                tasks.selectTask(input.nextInt() - 1);
                tasks.makeUncomplete(input.nextInt());
                break;
            case "4":
                System.out.println("Here are a list of your tasks, select the one you want to delete.");
                tasks.viewTasks();
                tasks.removeUncomlpeteTask(input.nextInt() - 1);
                break;
            case "5":
                System.exit(0);
                break;
                default:
                    System.out.println("Please select one of the options.");
                    break;
        }
    }
}