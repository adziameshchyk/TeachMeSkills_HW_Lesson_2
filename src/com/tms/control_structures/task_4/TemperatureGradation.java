package com.tms.control_structures.task_4;

import java.util.Scanner;

/**
 *Task:
 *
 * For the entered number t (outdoor temperature) output:
 *     If t>–5, then output "Heat".
 *     If –5>= t > –20, then output "Normal".
 *     If –20>= t, then output "Cold".
 */

public class TemperatureGradation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the outside t. To exit the program press 0 and confirm exit: ");

            int t = sc.nextInt();
            if (t == 0) {
                System.out.println("Do you want to exit the program? Yes (Y) / No, i want to check zero t (N): ");
                char choice = sc.next().charAt(0);
                if (choice == 'Y' || choice == 'y' || choice == 'н')
                    break;
                else if (choice != 'N' && choice != 'n' && choice != 'т') {
                    System.out.println("Invalid value, please try again.");
                    continue;
                }
            }

            if (t > -5)
                System.out.println("Warmly");
            else if (t >= -20)
                System.out.println("Normal");
            else
                System.out.println("Cold");
        }

        sc.close();
    }

}
