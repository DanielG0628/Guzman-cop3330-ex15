package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables and create scanner
        String username, password, passcheck;
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("Enter a username:");
        username = sc.nextLine();
        System.out.println("Enter a password:");
        password = sc.nextLine();
        System.out.println("What is the password?");
        passcheck = sc.nextLine();

        //if statements
        if(password.compareTo(passcheck) == 0)
            System.out.println("Welcome!");
        else
            System.out.println("I don't know you.");

        //close scanner
        sc.close();
    }
}