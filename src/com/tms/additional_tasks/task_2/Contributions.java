package com.tms.additional_tasks.task_2;

import java.util.Scanner;

/**
 * Task:
 *
 * For each month the bank accrues 7% of the amount of the deposit.
 * Write a program in which the user enters the initial deposit amount and the number of months.
 * The bank calculates the final amount of the deposit taking into account the monthly accruals.
 * Use a for loop to calculate an amount including percentages. Let the contribution amount be of type float.
 */

public class Contributions {

    public static void main(String[] args) {

        System.out.println("Enter the deposit amount and the number of months: ");

        Scanner scanner = new Scanner(System.in);
        float sum = scanner.nextFloat();
        int mouth = scanner.nextInt();

        for (int i = 0; i < mouth; ++i) {
            sum *= 1.07;
        }

        System.out.println("Final deposit amount: " + sum);

    }

}
