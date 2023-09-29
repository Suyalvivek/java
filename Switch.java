package com.vivek;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.print("enter the name of fruit to get description of that fruit :");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("yellow coloured sweet fruit ");
            case "Apple" -> System.out.println("red coloured all like fruit ");
            case "Orange" -> System.out.println("orange coloured ball like fruit rich in vitamin c");
            default -> System.out.println("enter only Orange,Apple,Mango");
        }
    }
}

