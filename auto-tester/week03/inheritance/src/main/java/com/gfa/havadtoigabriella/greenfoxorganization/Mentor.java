package com.gfa.havadtoigabriella.greenfoxorganization;

public class Mentor extends Person {
  /*Create a Mentor class that has the same fields and methods as the Person class, and has the following additional

fields:
level: the level of the mentor (junior / intermediate / senior)
methods:
getGoal(): prints "Educate brilliant junior software developers."
introduce(): prints "Hi, I'm name, a age year old gender level mentor."
The Mentor class has the following constructors:

Mentor(name, age, gender, level)
Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate
   */
  String level;

  public Mentor() {
    this.level = "intermediate";
  }

  public Mentor(String name, int age, String gender, String level) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.level = level;
  }

  @Override
  public void getGoal() {
    System.out.println("My goal is: Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm " + this.name + ", a " + this.age + " year old " + this.gender + " " + this.level +
            " mentor.");
  }
}
