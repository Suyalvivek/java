package com.vivek;

public class PrintArmstrong {
    public static void main(String[] args) {
        System.out.println("the three digit Armstrong no's are : ");
        for (int i = 100; i <1000 ; i++) {
            if (isArm(i)){
                System.out.println(i + "");
            }
        }
    }
    static boolean isArm(int n){
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n= n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }
}
