package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);
    private Tasks tasks = new Tasks(this);

    public void startMenu() {

        System.out.println("Welcome to your task manager, what would you like to do? \n" +
                "1. Create a new task \n" +
                "2. List all tasks \n" +
                "3. Remove a task \n" +
                "4. Exit");

        switch (input.nextLine()) {
            case "1":
                System.out.println("You have chosen to create a new task. \n" +
                        "What is the name of this task?");
                input.nextLine();
                NewTask newTask = new NewTask(input.nextLine());
                tasks.addTask();
                break;
            case "2":
                System.out.println("You have chosen to see all tasks.");
                tasks.viewTasks();
                startMenu();
                break;
            case "3":
                System.out.println("You have chosen to see only uncompleted tasks.");
        }
    }
}
