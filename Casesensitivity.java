package com.vivek;

import java.util.Scanner;

public class Casesensitivity {
    public static void main(String[] args) {
        System.out.println("Enter your word");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);
        if (ch >= 'a' && ch <='z'){
            System.out.println("the entered word is in lower case");
        }
        else System.out.println("the entered word is in upper case");

    }
}

