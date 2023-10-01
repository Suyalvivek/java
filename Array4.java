package com.vivek;

import java.util.Arrays;

public class Array4 {
    public static void main(String[] args) {
        System.out.print("INITIAL ARRAY : ");
        int[] arr = {78,89,90};
        System.out.println(Arrays.toString(arr));
        System.out.print("CHANGED ARRAY : ");
        change(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void change(int[] a){
        a[0] = 99;
    }
}
