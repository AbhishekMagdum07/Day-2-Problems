package com.bridgelabz;

import java.util.Scanner;

public class ArithmeticOperations {
    // Enter two numbers and do the following arithmetic Operations find max.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value of a =");
        int a = sc.nextInt();
        System.out.println("Enter a value of b =");
        int b = sc.nextInt();
        System.out.println("Enter a value of c =");
        int c = sc.nextInt();

        System.out.println("number1=" + (a + b * c));
        System.out.println("number2=" + (c + a / b));
        System.out.println("number3=" + (a % b + c));
        System.out.println("number4=" + (a * b + c));

        int number1 = a + b * c;
        int number2 = c + a / b;
        int number3 = a % b + c;
        int number4 = a * b + c;

        if (number1 > number2 & number1 > number3 & number1 > number4) {
            System.out.println("Maximum Number=" + number1);
        } else if (number2 > number1 & number2 > number3 & number2 > number4) {
            System.out.println("Maximum Number=" + number2);
        } else if (number3 > number1 & number3 > number2 & number3 > number4) {
            System.out.println("Maximum Number=" + number3);
        } else {
            System.out.println("Maximum Number=" + number4);
        }
    }
}
