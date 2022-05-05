package com.gfa.havadtoigabriella.pirates;

public class BattleApp {
  public static void main(String[] args) {
    Pirate pirate = new Pirate();
    Pirate pirate2 = new Pirate();
    pirate.drinkSomRum();
    pirate2.die();
    pirate.brawl(pirate2);
    Ship ship = new Ship();
    Ship otherShip = new Ship();
    ship.fillShip();
    otherShip.fillShip();
    ship.captain.drinkSomRum();
    ship.captain.drinkSomRum();
    System.out.println(ship.battle(otherShip));
    if (ship.battle(otherShip)) {
      ship.haveAParty();
    }
    System.out.println(ship.crew.get(2).drunkenness);
    System.out.println(ship.captain.drunkenness);
    System.out.println(ship);
  }
}
