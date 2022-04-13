package com.gfa.havadtoigabriella;

public class Cuboid {
  public static void main(String[] args) {
    // Write a program that stores 3 sides of a cuboid as variables (doubles)
    // The program should write the surface area and volume of the cuboid like:
    //
    // For example: if the 3 sides are 10, 10, and 10, then you program should
    // produce the following output:
    //
    // Surface Area: 600
    // Volume: 1000

    double a = 10;
    double b = 10;
    double c = 10;

    double surfaceArea = 2 * (a * b + a * c + b * c);
    double volume = a * b * c;

    System.out.println("Surface Area: " + surfaceArea + "\nVolume: " + volume);
  }
}
