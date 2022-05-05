package com.gfa.havadtoigabriella.pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
  /*Create a Ship class.
The Ship stores Pirateinstances in a list as the crew and has one captain who is also a Pirate.
When a ship is created it doesn't have a crew or a captain.
The ship can be filled with pirates and a captain via fillShip() method:
fills the ship with a captain and a random (maximum 113) number of pirates
Ships should be represented in a nice way on command line including information about
rum consumed by the captain and its state (dead or alive)
number of alive pirates in the crew
Ships should have a method to battle other ships: ship.battle(otherShip)
should return true if the actual ship (this) wins
the ship having higher calculated score wins
calculated score: Number of alive pirates in the crew - Number of consumed rum by the captain
The loser crew has a random number of losses (deaths).
The winning captain and crew has a party: everyone drinks a random number of rum :)
   */

  List<Pirate> crew = new ArrayList<>();
  Pirate captain = new Pirate();

  public void fillShip() {
    int numbersOfPeople = (int) Math.floor(Math.random() * (113 - 1 + 1) + 1);
    for (int i = 0; i < numbersOfPeople; i++) {
      this.crew.add(new Pirate());
    }
    this.crew.add(this.captain);
  }

  public boolean battle(Ship ship) {
    int pointsFirst = this.captain.getDrunkenness() + this.crew.size();
    int pointsSecond = ship.captain.getDrunkenness() + ship.crew.size();
    int numberWhoDies = (int) Math.floor(Math.random() * (this.crew.size() / 2 + 1) + 0);
    int numberWhoDies2 = (int) Math.floor(Math.random() * (ship.crew.size() / 2 + 1) + 0);
    if (pointsFirst > pointsSecond) {
      System.out.println("The first ship wins.");
      for (int i = 0; i < numberWhoDies2; i++) {
        ship.crew.remove(i);
      }
      return true;
    } else {
      System.out.println("The second ship wins");
      for (int i = 0; i < numberWhoDies; i++) {
        this.crew.remove(i);
      }
      return false;
    }
  }

  public void haveAParty() {
    int numberOfRums = (int) Math.floor(Math.random() * (20 + 1) + 0);
    for (int j = 0; j < numberOfRums; j++) {
      captain.drinkSomRum();
      for (int i = 0; i < crew.size(); i++) {
        crew.get(i).drinkSomRum();
      }
    }
  }

  @Override
  public String toString() {
    return "The captain's drunkenness is " + this.captain.getDrunkenness() + " unit, " +
        "number of pirates in the crew is " + this.crew.size();
  }
}
