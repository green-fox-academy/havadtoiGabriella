package com.gfa.havadtoigabriella;

public class Bmi {
  public static void main(String[] args) {
    double massInKg = 81.2;
    double heightInM = 1.78;
    double heightInMetersSquared = heightInM * heightInM;
    double bmi = massInKg / heightInMetersSquared;

    // Print the Body mass index (BMI) based on these values

    System.out.printf("The BMI is: %.2f", bmi);
  }
}