package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //simple for loop for int
            int[] intArray =  { 10, 20, 30 };
            for (int i = 0; i < intArray.length; i++)
            {
                System.out.println(intArray[i]);
            }
            //simple for loop for string
           String[] stringArray =  { "one", "two", "three"};
            for(int j=0; j < stringArray.length; j++)
            {
                System.out.println(stringArray[j]);
            }


        /*for loop to print
         *
         * *
         * * *
         * * * *
         * * * * *
         */

             for (int i = 0; i < 6; i++)
              {
                 for (int j = 0; j <i; j++)
                  {
                      System.out.print("*");
                  }
                  System.out.println();
              }


        /*for loop to print
         *
         * *
         * * *
         * * * *
         * * * * *
         */

            int n = 5;
             for(int i=0; i<n; i++)
             {
                 for (int j = 0; j <=n- i; j++)
                 {
                     System.out.print(" ");
                 }
                     for (int k=0;k<=i;k++)
                     {
                         System.out.print("*");
                     }
                 System.out.println();
             }





    }
}
