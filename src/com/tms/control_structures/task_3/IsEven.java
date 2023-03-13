package com.tms.control_structures.task_3;

import java.util.Scanner;

/**
 * Task:
 *
 * Write a program that receives a number on the input and outputs if it's even or not.
 */

public class IsEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number to check for parity. To exit the program press 0 and confirm exit: ");

            int num = sc.nextInt();
            if (num == 0) {
                System.out.println("Do you want to exit the program? Yes (Y) / No, I want to check the number 0 (N): ");
                char choice = sc.next().charAt(0);
                if (choice == 'Y' || choice == 'y' || choice == 'н')
                    break;
                else if (choice != 'N' && choice != 'n' && choice != 'т') {
                    System.out.println("Invalid value, please try again.");
                    continue;
                }
            }
            System.out.println("This number is " + (num % 2 == 0? "even." : "odd."));
        }

        sc.close();

    }

}
