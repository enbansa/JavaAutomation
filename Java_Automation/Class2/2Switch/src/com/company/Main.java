package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = obj.nextInt();

        switch (num){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("three");
                break;

            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println("Error");
                break;
        }


    }
}
