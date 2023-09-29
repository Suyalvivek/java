package com.vivek;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the no");
        int n = input.nextInt();
        int count = 0;
        while (n > 0) {
        int rem = n%10;
        if(rem==3){
            count++;
        }
        n=n/10;
        }
        System.out.println("the no of 3 in given no is"+ count);
    }
}



