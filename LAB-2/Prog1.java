/*
- Method Overloading is a feature that allows a class to have more than 
one method of the same name.
Three ways to overload a method
1. Number of Parameters.
2. Data type of Parameters.
3. Sequence of Data type of parameters.
*/



package com.lab2;
class overloading {
 public void intro(char name){
 System.out.println("Hello ,folks welcome to Taj");
 }
 public void intro(char name, int a){
 System.out.println("Hello,Buddy Welcome to Taj, Btw whats your 
age");
 }
 }
public class Main {
 public static void main(String[] args) {
 // write your code here
 overloading call = new overloading();
 call.intro('n');
 call.intro('n',7);
 }
}
