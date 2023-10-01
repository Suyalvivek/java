package com.vivek;

import java.util.ArrayList;
import java.util.Scanner;

public class Dynamicarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter how many numbers you want to put in array");
        int num = in.nextInt();
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(in.nextInt());
        }
        System.out.println("enter the elements you want in Array : ");
        System.out.println(list);
    }
}
