package com.vivek;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your roll no:");
        int rollno = input.nextInt();
        System.out.println("Your roll no is " + rollno);
    }
}
