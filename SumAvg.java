package com.vivek;

public class SumAvg {
    public static void main(String[] args) {
        int sum = 0;
        double avg;
        int[] numbers = {-1,0,1,2,3,4,5};
        for (int number:numbers) {
            sum+=number;
        }
        int length = numbers.length;
        avg = (double) sum /(double)length;
        System.out.println("the sum of numbers is : " + sum);
        System.out.println("the avg of numbers is : " + avg);
    }
}
