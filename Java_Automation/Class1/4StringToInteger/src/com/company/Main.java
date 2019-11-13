package com.company;

import com.sun.tools.javac.util.Convert;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj= new Scanner(System.in);
        System.out.println(" Please enter your age");
        String stringAge = myObj.nextLine();

       int age =Integer.parseInt(stringAge);
        System.out.println("Your age is "+ age);
    }
}
