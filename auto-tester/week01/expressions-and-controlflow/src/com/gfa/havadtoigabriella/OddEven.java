package com.gfa.havadtoigabriella;

import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input,
    // then prints "Odd" if the number is odd, or "Even" if it is even
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter a number and I'll tell you if it's odd or even: ");
    int yourNumber = sc.nextInt();

    if (yourNumber % 2 == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
  }
}