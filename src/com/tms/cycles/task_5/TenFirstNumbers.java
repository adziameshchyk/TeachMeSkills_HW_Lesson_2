package com.tms.cycles.task_5;

/**
 * Task:
 *
 * Output the first 10 numbers of the sequence 0, -5, -10, -15...
 */

public class TenFirstNumbers {

    public static void main(String[] args) {

        for (int i = 0, num = 0; i < 10; ++i) {
            System.out.print((num += -5) + " ");
        }

    }

}
