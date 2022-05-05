package com.gfa.havadtoigabriella.petrolstation;

public class Main {
  //Create Station and Car classes

  public static void main(String[] args) {
    Station mol = new Station();
    Car toyota = new Car();
    System.out.println(toyota.gasAmount);
    System.out.println(mol.gasAmount);
    mol.refill(toyota);
    System.out.println(toyota.gasAmount);
    System.out.println(mol.gasAmount);
  }
}
