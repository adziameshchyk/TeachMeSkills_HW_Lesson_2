package com.tms.control_structures.task_5;

import java.util.Scanner;

/**
 *Task:
 *
 * By the entered number, determine the color of the rainbow
 * (1 -red, 4 green, etc.).
 */

public class RainbowColorByNumber {

    public static void main(String[] args) {

        System.out.println("Enter the rainbow color number. Enter '0' to end the program: ");

        Scanner sc = new Scanner(System.in);
        String num;

        do {
            num = sc.next();
            switch (num) {
                case "1", "One", "one" -> System.out.println("Red.");
                case "2", "Two", "two" -> System.out.println("Orange.");
                case "3", "Three", "three" -> System.out.println("Yellow.");
                case "4", "Four", "four" -> System.out.println("Green.");
                case "5", "Five", "five" -> System.out.println("Blue.");
                case "6", "Six", "six" -> System.out.println("Indigo.");
                case "7", "Seven", "seven" -> System.out.println("Violet.");
                case "0" -> System.out.println("Program completed");
                default -> System.out.println("There are only seven colors of the rainbow!");
            }
        } while (!num.equals("0"));

        sc.close();

    }

}
