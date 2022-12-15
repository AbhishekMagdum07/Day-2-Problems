package com.bridgelabz;

import java.util.Scanner;

public class ForLoopProblem {
    // Write a Program for the sum of n natural numbers eg. Input N=5 output 1+2+3+4+5

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number =");
        int number = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= number; i++) {
            total = ((number * (number+1)) /2);
            //System.out.println("The sum of Natural numbers is ="+ (number * (number+1)) /2);

        }
        System.out.println("The sum of Natural numbers is =" + total);
    }
}
