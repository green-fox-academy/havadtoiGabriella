package com.gfa.havadtoigabriella.pirates;

public class Pirate {
  /*drinkSomeRum() - intoxicates the Pirate by one
  howsItGoingMate() - when called, the Pirate replies:
      if drinkSomeRun() was called less than 4 times:
      "Pour me anudder!"
      else:
      "Arghh, I'ma Pirate. How d'ya d'ink its goin?". Then the pirate passes out and sleeps it off (gets rid of the intoxication).
  If you manage to get this far, then you can try to do the following.

  brawl(Pirate) - where pirate fights another pirate (if both of them are alive):
  there is 1/3 chance that this dies, the other dies or they both pass out.
  die() - this kills off the pirate. When a pirate is dead, every method simply results in: he's dead.
  And... if you get that far...

  Add a parrot.
  */
  int drunkenness = 0;
  int lifePoints = 100;

  public void drinkSomRum() {
    if (this.lifePoints == 0) {
      System.out.println("He's dead");
    } else {
      this.drunkenness += 1;
    }
  }

  public void howsItGoingMate() {
    if (this.lifePoints == 0) {
      System.out.println("He's dead");
    } else if (this.drunkenness > 0) {
      for (int i = 0; i < (int) Math.floor(Math.random() * (4 - 1 + 1) + 1); i++) {
        System.out.println("Pour me anudder!");
      }
    } else {
      System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
    }
  }


  public void brawl(Pirate pirate) {
    if (this.lifePoints > 0 && pirate.lifePoints > 0) {
      switch ((int) Math.floor(Math.random() * (3 - 1 + 1) + 1)) {
        case 1:
          this.lifePoints = 0;
          System.out.println("The first pirate died");
          break;
        case 2:
          pirate.lifePoints = 0;
          System.out.println("The second pirate died");
          break;
        case 3:
          this.lifePoints = 0;
          pirate.lifePoints = 0;
          System.out.println("Both pirate died");
      }
    } else if (this.lifePoints == 0) {
      System.out.println("The first one is already dead");
    } else if (pirate.lifePoints == 0) {
      System.out.println("The second one is already dead");
    }
  }

  public void die() {
    this.lifePoints = 0;
  }

  public int getLifePoints() {
    return this.lifePoints;
  }

  public int getDrunkenness() {
    return this.drunkenness;
  }

}
