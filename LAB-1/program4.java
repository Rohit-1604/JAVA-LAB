package com.program4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   // Here we used compareTo to arrange in  lexicographically
     //input

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Names");

        String[] names = new String[3];
        for (int i = 0; i < names.length; i++) {
            names[i] = input.nextLine();
        }

        String local;
        for(int i=0;i<names.length;i++){
            for(int j=i+1;j<names.length;j++){
                //here we will sort by comparing unicode
                if (names[i].compareTo(names[j]) > 0) {
                    local = names[i];
                    names[i] = names[j];
                    names[j] = local;
                }
            }
        }
      System.out.println("Names in sorted order");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
