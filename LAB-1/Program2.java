package com.prog2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   // write your code here
        int a,b,c;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First num");
        a= input.nextInt();
        System.out.println("Enter the Second num");
        b= input.nextInt();
        System.out.println("Enter the Third num");
        c= input.nextInt();

        if(a>=b) {
            if (a > c)
                System.out.println("First number is Biggest");

            else {
                System.out.println("Third number is Biggest");
            }
        }
        else if(b>=a){
            if(b>c){
                System.out.println("Second number is Biggest");
            }
            else{
                System.out.println("Third number is Biggest");
            }
        }

    }
}
