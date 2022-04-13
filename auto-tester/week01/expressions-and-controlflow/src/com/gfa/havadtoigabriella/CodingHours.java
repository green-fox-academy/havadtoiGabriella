package com.gfa.havadtoigabriella;

public class CodingHours {
  public static void main(String[] args) {
    // An average Green Fox attendee codes 6 hours daily
    // The semester is 17 weeks long
    int averageCodingHours = 6;
    int semesterTimeInWeeks = 17;
    int semesterTimeInDays = 17 * 7;
    int weekDaysInASemester = semesterTimeInWeeks * 5;
    // Print how many hours is spent with coding in a semester by an attendee,
    // if the attendee only codes on workdays.
    int studyHoursInASemester = weekDaysInASemester * averageCodingHours;
    System.out.println("Number of hours, spent with studying in a semester: " + studyHoursInASemester);
    // Print the percentage of the coding hours in the semester if the average
    // work hours weekly is 52
    int totalWorkingHours = 17 * 52;
    double percentOfSemesterSpentWithCoding =((double) studyHoursInASemester / totalWorkingHours) * 100;
    System.out.printf("Percentage of time spent with coding in a semester: " + ("%.2f"), percentOfSemesterSpentWithCoding);
    System.out.print("%");
  }
}