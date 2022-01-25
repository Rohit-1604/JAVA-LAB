package com.program3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   // write your code here

      int number;
      long factorial =1;
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        number = input.nextInt();

        for(int i=1;i<=number;i++){
            factorial*=i;
        }
        System.out.println(factorial);
    }
}
