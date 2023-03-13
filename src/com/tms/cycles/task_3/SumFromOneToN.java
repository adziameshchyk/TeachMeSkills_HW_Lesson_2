package com.tms.cycles.task_3;

import java.util.Scanner;

/**
 * Task:
 *
 * Write a program where the user enters any positive integer.
 * And the program sums up all numbers from 1 to the number entered by the user.
 */

public class SumFromOneToN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int sum = 0;
        for (int i = 1, n = sc.nextInt(); i < n + 1; ++i) {
            sum += i;
        }
        System.out.println(sum);

    }

}
