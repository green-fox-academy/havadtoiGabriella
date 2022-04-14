package com.gfa.havadtoigabriella;

import java.util.Scanner;

public class IsPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Please give me a number and I'll tell you if its a prime number or not: ");
    int number = sc.nextInt();
    isPrime(number);
    if (isPrime(number) == true) {
      System.out.print("It's a prime number.");
    } else if (isPrime(number) == false) {
      System.out.println("It's not a prime number.");
    }
  }

  public static boolean isPrime(int number) {
    boolean isPrime = true;
    if ((number < 2) || ((number > 2) && (number % 2 == 0))) {
      isPrime = false;
    }
    for (int i = 3; i * i <= number; i += 2) {
      if (number % i == 0) {
        isPrime = false;
      }
    }
    return isPrime;
  }
}
