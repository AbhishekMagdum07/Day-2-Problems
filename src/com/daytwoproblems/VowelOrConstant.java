package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConstant {

    // Write a Program to Check Vowel or Consonant
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Character = ");
        char ch = sc.next().charAt(0);

       // char ch = 'a';


        switch (ch) {

            case 'a':
                System.out.println(ch + " is vowel");
                break;
            case 'e':
                System.out.println(ch + " is vowel");
                break;
            case 'i':
                System.out.println(ch + " is vowel");
                break;
            case 'o':
                System.out.println(ch + " is vowel");
                break;
            case 'u':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is constant");
        }
    }
}