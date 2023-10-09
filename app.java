package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get member's name and age
        System.out.print("Enter member's name: ");
        String memberName = scanner.nextLine();
        System.out.print("Enter member's age: ");
        int memberAge = scanner.nextInt();

        // Display gym information
        System.out.println("Welcome to svgGYM!");
        System.out.println("Gym Hours: 5-9am and 6-9pm");
        System.out.println("Membership Fee: 1 month - 500/-");

        // Display member information
        System.out.println("\nMember Details:");
        System.out.println("Name: " + memberName);
        System.out.println("Age: " + memberAge);
    }
}

