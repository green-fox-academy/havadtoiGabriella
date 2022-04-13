package com.gfa.havadtoigabriella;

import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter the number of chickens: ");
    int chickenLegs = sc.nextInt();
    System.out.print("Please enter the number of pigs: ");
    int pigLegs = sc.nextInt();

    int totalLegsOfAnimals = chickenLegs * 2 + pigLegs * 4;
    System.out.println("The amount of legs all the animals have is : " + totalLegsOfAnimals);

  }
}
