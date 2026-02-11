package com.venkatesh.bank;

import com.venkatesh.bank.exception.*;
import com.venkatesh.bank.model.*;
import com.venkatesh.bank.service.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserService uService = new UserService();
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("Welcome to Banking System");
        outerLoop:
        while(true) {
            System.out.println("1. Create User");
            System.out.println("2. Fetch user");
            System.out.println("3. Exit");
            System.out.print("Enter your option:\t");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter name:\t");
                    String name = sc.next();
                    System.out.print("Enter e-mail:\t");
                    String email = sc.next();
                    try {
                        User newUser = uService.createUser(name, email);
                        System.out.printf("Your User ID is: %d\n", newUser.getId());
                    } catch (IllegalEmailException | IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter the User ID you want to search:\t");
                    int id = sc.nextInt();
                    try {
                        User foundUser = uService.getUserById(id);
                        System.out.println("Your user details are:");
                        System.out.printf("Name: %s\n", foundUser.getName());
                        System.out.printf("Email: %s\n", foundUser.getEmail());
                    } catch (UserNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the banking system");
                    break outerLoop;
                default:
                    System.out.println("Enter a valid choice\n");
                    break;
            }
        }
    }
}
