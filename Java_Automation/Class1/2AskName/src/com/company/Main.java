package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter your name");//Print in
        String name = myObj.nextLine();

        String response = " Hello " + name +" ! Welcome to my system"; //Print in
        System.out.println(response);

    }
}
