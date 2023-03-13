package com.tms.additional_tasks.task_1;

/**
 * Task:
 *
 * Display the first 11 terms of the Fibonacci sequence.
 */

public class FibonacciNumbers {

    public static void main(String[] args) {

        int n = 11, first = 0, second = 1;
        while (n-- != 0) {
            System.out.print(first + " ");
            second += first;
            first = second - first;
        }

    }

}
