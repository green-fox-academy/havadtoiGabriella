package com.gfa.havadtoigabriella.farm;

public class Main {
  public static void main(String[] args) {
    Farm myFarm = new Farm(5);
    Animal pig = new Animal();
    Animal cat = new Animal();
    Animal mouse = new Animal();
    Animal cow = new Animal();
    Animal parrot = new Animal();
    //Add animals to the farm
    myFarm.breed(pig);
    myFarm.breed(cat);
    myFarm.breed(mouse);
    myFarm.breed(cow);
    myFarm.breed(parrot);
    System.out.println(myFarm.listOfAnimals);
    //Feed the animals
    pig.eat();
    pig.eat();
    pig.eat();
    cow.eat();
    cow.eat();
    cow.eat();
    cow.eat();
    cat.eat();
    cat.eat();
    cat.eat();
    mouse.eat();
    mouse.eat();
    parrot.eat();
    parrot.eat();
    parrot.eat();
    Animal lion = new Animal();
    //Add new animal to farm with no place for it.
    myFarm.breed(lion);
    System.out.println(myFarm.listOfAnimals);
    //Sell the least hungry animal");
    myFarm.sell();
    System.out.println(myFarm.listOfAnimals);
   //Add new animal to farm.
    myFarm.breed(lion);
    System.out.println(myFarm.listOfAnimals);
  }
}
