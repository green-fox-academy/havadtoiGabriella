package com.gfa.havadtoigabriella.farm;

public class Animal {
  /*Every animal has a hunger value, which is a whole number
Every animal has a thirst value, which is a whole number
When creating a new animal instance these values must be set to the default 50 value
Every animal can eat() which decreases its hunger by one
Every animal can drink() which decreases its thirst by one
Every animal can play() which increases both its hunger and thirst by one
   */

  int hunger;
  int thirst;

  public Animal() {
    this.hunger = 50;
    this.thirst = 50;
  }

  public void eat() {
    this.hunger -= 1;
  }

  public void drink() {
    this.thirst -= 1;
  }

  public void play() {
    this.hunger += 1;
    this.thirst += 1;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "hunger=" + hunger +
        ", thirst=" + thirst +
        '}';
  }
}
