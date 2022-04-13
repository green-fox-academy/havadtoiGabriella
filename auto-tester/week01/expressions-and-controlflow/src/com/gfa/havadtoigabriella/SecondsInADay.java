package com.gfa.havadtoigabriella;

public class SecondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    // Write a program that prints the remaining seconds (as an integer) from a
    // day if the current time is represented by the variables above

    int timeThatsGoneTodayInSeconds = currentHours * 60 * 60 + currentMinutes * 60 + currentSeconds;
    int totalSecondsInADay = 24 * 60 * 60;
    int remainingSeconds = totalSecondsInADay - timeThatsGoneTodayInSeconds;
    System.out.println("Remaning seconds today: " + remainingSeconds);
    
  }
}
