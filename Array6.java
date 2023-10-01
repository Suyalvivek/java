package com.vivek;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the elements for a 3X3 matrix : ");
        int[][] arr = new int[3][3];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        System.out.print(Arrays.deepToString(arr));
    }
}
