package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

               Scanner obj = new Scanner(System.in);
               System.out.println("enter a number");
              int number = obj.nextInt();
              if (number<40) System.out.println("You are very young");
                else if (number>=40 && number<=55){
                    System.out.println("You are young");
                }
                else if(number>55){
                    System.out.println("You are old");
                }
                else {
                    System.out.println("You are very very young");
                }




    }
}
