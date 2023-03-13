package com.tms.additional_tasks.personal_extra_task;

import java.util.Scanner;

/**
 * Task:
 *
 * Modify your program (it will be enough to modify only one class to understand the principle)
 * so that your result does not depend on whether the letter is capital or small.
 */

public class CaseInsensitiveInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String month;
        do {
            String newMonth = "";
            System.out.println("Enter the month number in the nominative case or a digit. " +
                               "Enter '0' to end the program: ");
            month = scanner.next();

            for (int i = 0; i < month.length(); ++i) {
                char currentLetter = month.charAt(i);
                int caseDifference = 'a' - 'A';
                if (currentLetter >= 'A' && currentLetter <= 'Z') {
                    newMonth += (char) (currentLetter + caseDifference);
                }
                else
                    newMonth += currentLetter;
            }

            switch (newMonth) {
                case "1":
                case "one":
                    System.out.println("January.");
                    break;
                case "2":
                case "two":
                    System.out.println("February.");
                    break;
                case "3":
                case "three":
                    System.out.println("March.");
                    break;
                case "4":
                case "four":
                    System.out.println("April.");
                    break;
                case "5":
                case "five":
                    System.out.println("May.");
                    break;
                case "6":
                case "six":
                    System.out.println("June.");
                    break;
                case "7":
                case "seven":
                    System.out.println("July.");
                    break;
                case "8":
                case "eight":
                    System.out.println("August.");
                    break;
                case "9":
                case "nine":
                    System.out.println("September.");
                    break;
                case "10":
                case "ten":
                    System.out.println("October.");
                    break;
                case "11":
                case "eleven":
                    System.out.println("November.");
                    break;
                case "12":
                case "twelve":
                    System.out.println("December.");
                    break;
                case "0":
                    break;
                default:
                    System.out.println("There is no such month!");
            }

        } while (!month.equals("0"));

        scanner.close();

    }

}
