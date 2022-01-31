package com.programlab2;

public class Main {
    static int shape(int length,int width ,int height){
        return length*width*height;
    }
    static int shape(int a){
        //For cube a^3
        return a*a*a;
    }

    static int shape(int base,int height){
        //for Prism type box B*h
        return base*height;
    }
    static double shape(double base,double height){
        //For Pyramid type box
        return 1/3D*(base*height);
    }

    public static void main(String[] args) {
        // Finding volume of rectangle Box
        System.out.println(shape(2,3,2));
        System.out.println(shape(2));
        // Finding volume of Prism Box
        System.out.println(shape(2,5));
        // Finding volume of Pyramid Box
        System.out.println(shape(10.0D,4.0D));

    }
}
