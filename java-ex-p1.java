/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Drew Butler
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //prompts the user to input their name
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your name?");

        //prints user's name in sentence 
        String userName = myObj.nextLine();
        System.out.println("Hello, " + userName + ", nice to meet you!");

        myObj.close();
    }
}

