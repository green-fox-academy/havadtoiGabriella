package com.gfa.havadtoigabriella;

import java.util.Scanner;

public class MileToKmConverter {
  public static void main(String[] args) {
    // Write a program that asks for a double that is a distance in miles,
    // then it converts that value to kilometers and prints it
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter a fraction, this will be the distance in miles: ");
    double distanceInMiles = sc.nextDouble();
    double oneMileInKms = 1.609344;
    double distanceInKms = distanceInMiles * oneMileInKms;
    System.out.println("The distance in kilometers is: " + distanceInKms);
  }
}
