package com.vivek;

import java.util.Scanner;

public class Largestofthree {
    public static void main(String[] args) {
        System.out.print("Enter the three numbers you want to find the maximum of:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//-------------------1ST---------------------------------------
//        if (a>b && a>c){
//            System.out.println("the maximum number is " + a);
//        } else if (b>a && b>c) {
//            System.out.println("the maximum number is " + b);
//
//        }
//        else  System.out.println("the maximum number is " + c);
//
//    }
//----------------------2ND-------------------------------------
        int max = Math.max(c, Math.max(a, b));
        System.out.println("the maximum number is " + max);

    }
}