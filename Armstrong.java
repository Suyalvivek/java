package com.vivek;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.print("enter a three digit number to check if it's armstrong or not : ");
        Scanner in = new Scanner(System.in);
        int var = in.nextInt();
        boolean ans = isArmstrong(var);
        System.out.println(ans);
    }
    static boolean isArmstrong(int n){
    int original = n;
    int sum = 0;
    while (n>0){
        int rem = n%10;
        n=n/10;
        sum = sum + rem*rem*rem;
    }
    return sum == original;
//    if (sum == original){
//        return true;
//    }return false;
    }

}
