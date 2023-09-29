package com.vivek;

import java.util.Scanner;

public class Func {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter no 1:");
        int num1 = in.nextInt();
        System.out.print("enter no 2 :");
        int num2 = in.nextInt();
        int ans = sum3(num1,num2);
        System.out.println("the sum is : " + ans);
    }
    static int sum3(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }
}
