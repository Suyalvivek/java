package com.vivek;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int ans = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("enter the operator");
            char operator = input.next().trim().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                System.out.println("enter two numbers");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if (operator == '+') {
                    ans = num1 + num2;
                }
                if (operator == '-') {
                    ans = num1 - num2;
                }
                if (operator == '*') {
                    ans = num1 * num2;
                }
                if (operator == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }

            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println(ans);
            System.out.println("will continue if want to stop press x");
        }
    }
}

