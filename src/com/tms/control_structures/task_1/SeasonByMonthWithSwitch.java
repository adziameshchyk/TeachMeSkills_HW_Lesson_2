package com.tms.control_structures.task_1;

import java.util.Scanner;

/**
 * Task:
 *
 * Write a program that displays the name of the season by month number.
 * When solving, use the switch-case statement.
 */

public class SeasonByMonthWithSwitch {

    public static void main(String[] args) {

        String month;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the month number in the nominative case or a digit. Enter '0' to end the program: ");

            month = sc.next();

            switch (month) {
                case "12", "Twelve", "twelve", "1", "One", "one", "2", "Two", "two" -> System.out.println("Winter.");
                case "3", "Three", "three", "4", "Four", "four", "5", "Five", "five" -> System.out.println("Spring.");
                case "6", "Six", "six", "7", "Seven", "seven", "8", "Eight", "eight" -> System.out.println("Summer.");
                case "9", "Nine", "nine", "10", "Ten", "ten", "11", "Eleven", "eleven" -> System.out.println("Autumn.");
                case "0" -> System.out.println("Program completed");
                default -> System.out.println("There is no such month!");
            }
        } while (!month.equals("0"));
        sc.close();

    }

}
