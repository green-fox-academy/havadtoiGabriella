package com.gfa.havadtoigabriella.petrolstation;

public class Station {
  /* Station
  it stores how much gas is avaliable: gasAmount
  it can refill a car: refill(car):
  decreases the gasAmount by the capacity of the car (let us suppose that the car is empty) and
  increases the car's gasAmount
   */
  int gasAmount = 10000;

  public void refill(Car car) {
    this.gasAmount -= car.capacity;
    car.gasAmount += car.capacity;
  }
}
