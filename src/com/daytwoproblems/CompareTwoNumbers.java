package com.bridgelabz;

import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number =");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number =");
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println("Maximum Number is =" + num1);
            System.out.println("Minimum Number is ="+ num2);
        } else {
            System.out.println("Maximum Number is =" + num2);
            System.out.println("Minimum Number is =" + num1);

        }
    }

}
