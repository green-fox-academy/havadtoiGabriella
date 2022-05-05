package com.gfa.havadtoigabriella.greenfoxorganization;

public class Sponsor extends Person {
  /*Create a Sponsor class that has the same fields and methods as the Person class, and has the following additional

fields:
company: name of the company
hiredStudents: number of students hired
method:
introduce(): prints "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
hire(): increases hiredStudents by 1
getGoal(): prints "Hire brilliant junior software developers."
The Sponsor class has the following constructors:

Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0
   */
  String company;
  int hiredStudents;

  public Sponsor() {
    this.company = "Google";
    this.hiredStudents = 0;
  }

  public Sponsor(String name, int age, String gender, String company) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.company = company;
    this.hiredStudents = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Hire brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender +
        " who represents " + this.company + " and hired " + this.hiredStudents +
        " students so far.");
  }

  public void hire() {
    this.hiredStudents += 1;
  }
}
