package com.gfa.havadtoigabriella.farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
  /*Reuse your Animal class
Create a Farm class
it has a list of Animals listOfAnimals
it has a limit that defines how many animals can be kept in the Farm and can be set when the Farm is created
it has two methods:
breed() -> creates a new animal if there's place for it
sell() -> removes the least hungry animal
   */
  List<Animal> listOfAnimals = new ArrayList<>();
  int limit;


  public Farm(int limit) {
    this.limit = limit;
  }

  public void breed(Animal animal) {
    if (listOfAnimals.size() < limit) {
      listOfAnimals.add(animal);
    } else {
      System.out.println("There are too many animals on the farm.");
    }
  }

  public void sell() {
    int minHunger = Integer.MAX_VALUE;
    int index = 0;
    for (int i = 0; i < listOfAnimals.size(); i++) {
      if (listOfAnimals.get(i).hunger < minHunger) {
        minHunger = listOfAnimals.get(i).hunger;
        index = i;
      }
    }
    listOfAnimals.remove(listOfAnimals.get(index));
  }
}
