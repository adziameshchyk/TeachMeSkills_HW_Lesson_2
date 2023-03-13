package com.tms.cycles.task_1;

/**
 *Task:
 *
 * Use a for loop to display odd numbers from 1 to 99.
 * When solving, use the increment operator (++).
 */

public class OddHundred {

    public static void main(String[] args) {

        for (int i = 1; i < 100; i++) {
            System.out.println(i % 2 != 0? i : ++i);
        }

    }

}
