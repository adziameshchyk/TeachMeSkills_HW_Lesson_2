package com.tms.control_structures.task_2;

import java.util.Scanner;

/**
 * Task:
 *
 * Write a program that displays the name of the season by month number.
 * When solving, use the if-else-if statement.
 */


public class SeasonByMonthWithIfElseIf {

    public static void main(String[] args) {

        System.out.println("Enter the month number in the nominative case or a digit. Enter '0' to end the program: ");

        Scanner sc = new Scanner(System.in);
        while (true) {
            String month = sc.next();
            if (month.equals("12") || month.equals("Twelve") || month.equals("twelve") ||
                month.equals("1") || month.equals("One") || month.equals("one") ||
                month.equals("2") || month.equals("Two") || month.equals("two"))
                System.out.println("Winter.");

            else if (month.equals("3") || month.equals("Three") || month.equals("three") ||
                     month.equals("4") || month.equals("Four") || month.equals("four") ||
                     month.equals("5") || month.equals("Five") || month.equals("five"))
                System.out.println("Spring.");

            else if (month.equals("6") || month.equals("Six") || month.equals("six") ||
                     month.equals("7") || month.equals("Seven") || month.equals("seven") ||
                     month.equals("8") || month.equals("Eight") || month.equals("eight"))
                System.out.println("Summer.");

            else if (month.equals("9") || month.equals("Nine") || month.equals("nine") ||
                     month.equals("10") || month.equals("Ten") || month.equals("ten") ||
                     month.equals("11") || month.equals("Eleven") || month.equals("eleven"))
                System.out.println("Autumn.");

            else if (month.equals("0"))
                break;
            else
                System.out.println("There is no such month!");
        }
        sc.close();

    }

}
