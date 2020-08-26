package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter your birth year: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        num = 2020 - num;
        int retirement = 60 - num;

        if (num >= 60) {
            System.out.println("You are retired");
        } else {

            System.out.println("You will retire in " + retirement + " years");
        }

    }
}
