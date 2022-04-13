package com.gfa.havadtoigabriella;

import java.util.Scanner;

public class AverageOfInput {
  public static void main(String[] args) {
    // Write a program that asks for 5 integers in a row,
    // then it should print the sum and the average of these numbers like:
    //
    // Sum: 22, Average: 4.4
    Scanner sc = new Scanner(System.in);

    int yourNumber;
    int sumOfYourNumbers = 0;
    System.out.println("Please enter 5 number: ");

    for (int i = 1; i < 6; i++) {
      yourNumber = sc.nextInt();
      sumOfYourNumbers += yourNumber;
    }

    double avgOfYourNumbers = (double)sumOfYourNumbers / 5;

    System.out.println("Sum: " + sumOfYourNumbers);
    System.out.println("Average: " + avgOfYourNumbers);
  }
}
