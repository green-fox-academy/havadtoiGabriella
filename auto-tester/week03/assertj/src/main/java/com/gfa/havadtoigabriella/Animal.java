package com.gfa.havadtoigabriella;

public class Animal {
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
