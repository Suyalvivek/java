package com.vivek;

public class Array5 {
    public static void main(String[] args) {
        System.out.println("the elements of the array are");
       int [][] arr ={ {88,89,90},
                       {77,74,75},
                       {47,48,50} };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
