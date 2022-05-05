package com.gfa.havadtoigabriella.greenfoxorganization;

public class Person {
  /*Create a Person class with the following fields:

name: the name of the person
age: the age of the person (whole number)
gender: the gender of the person (male / female)
And the following methods:

getGoal(): prints "My goal is: Live for the moment!"
introduce(): prints "Hi, I'm name, a age year old gender."
And the following constructors:

Person(name, age, gender)
Person(): sets name to Jane Doe, age to 30, gender to female
   */

  String name;
  int age;
  String gender;

  public Person() {
    this.name = "Jane Doe";
    this.age = 30;
    this.gender = "female";
  }

  public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }


  public void getGoal() {
    System.out.println("My goal is: Live for the moment!");
  }

  public void introduce() {
    System.out.println("Hi, I'm " + this.name + ", a " + this.age + " year old " + gender + ".");
  }
}
