package com.gfa.havadtoigabriella;

import javax.sound.midi.Soundbank;

public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    //
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    //
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52

    int avgHourOfCoding = 6;
    int weeksOfTheSemester = 17;
    int numberOfDaysSpentCodingOnlyOnWorkdays = weeksOfTheSemester*5;
    int hoursSpentCodingOnlyOnWorkdays = numberOfDaysSpentCodingOnlyOnWorkdays * 6;
    System.out.println("The attendee spend "+ hoursSpentCodingOnlyOnWorkdays+ " hours with coding if she only codes on workdays.");

    int avgWorkHoursWeekly = 52;
    int totalWorkHoursForTheHallSemester = avgWorkHoursWeekly * 17;
    double percentageOfTheCodingHoursInTheSemester = (hoursSpentCodingOnlyOnWorkdays/(double)totalWorkHoursForTheHallSemester)*100;
    System.out.printf("Percentage of time spent with coding in a semester: " + ("%.2f"), percentageOfTheCodingHoursInTheSemester);
    System.out.print("%");
    
  }
}
