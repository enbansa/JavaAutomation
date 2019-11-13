package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj= new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = myObj.nextInt();
        System.out.println("Your age is " + age);
    }
}
