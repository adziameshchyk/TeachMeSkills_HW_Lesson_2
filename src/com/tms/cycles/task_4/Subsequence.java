package com.tms.cycles.task_4;

/**
 * Task:
 *
 * It is necessary that the program displays the following sequence on the screen:
 * 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
 * Use a while loop in your solution.
 */

public class Subsequence {

    public static void main(String[] args) {

        int i = 7;
        while (i < 100) {
            System.out.print((i) + " ");
            i += 7;

        }

    }

}
