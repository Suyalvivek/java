package com.vivek;

import java.util.Scanner;

public class Fibonaaci {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int count = 2;
        System.out.println("the fibonacci series is");
        while (count<=n){
            int third = second;
            second = second+first;
            first = third;
            count++;
            System.out.println(second);
        }

    }

}
