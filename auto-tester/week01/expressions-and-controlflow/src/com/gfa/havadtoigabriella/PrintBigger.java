package com.gfa.havadtoigabriella;

import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter the first number: ");
    int firstNum = sc.nextInt();
    System.out.print("Please enter the second number: ");
    int secondNum = sc.nextInt();

    if (firstNum > secondNum) {
      System.out.println("The bigger number is: " + firstNum);
    } else {
      System.out.println("The bigger number is: " + secondNum);
    }
  }
}