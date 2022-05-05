package com.gfa.havadtoigabriella.pokemon;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Pokemon> pokemonListOfAsh = initializePokemons();

    // Every pokemon has a name and a type.
    // Certain types are effective against others, e.g. water is effective against fire.

    // Ash has a few pokemon.
    // A wild pokemon appeared!

    Pokemon wildPokemon = new Pokemon("Oddish", "grass", "water");

    // Which pokemon should Ash use?
    // Write the necessary code to get the name of the right pokemon and print it:
    Pokemon chosenOne = new Pokemon();
    for (Pokemon ashesPokemon : pokemonListOfAsh) {
      if (ashesPokemon.isEffectiveAgainst(wildPokemon)) {
        chosenOne = ashesPokemon;
        break;
      }
    }

    System.out.print("I choose you, " + chosenOne.name);
  }

  private static List<Pokemon> initializePokemons() {
    List<Pokemon> pokemon = new ArrayList<>();

    pokemon.add(new Pokemon("Bulbasaur", "grass", "water"));
    pokemon.add(new Pokemon("Pikachu", "electric", "water"));
    pokemon.add(new Pokemon("Charizard", "fire", "grass"));
    pokemon.add(new Pokemon("Pidgeot", "flying", "fighting"));
    pokemon.add(new Pokemon("Kingler", "water", "fire"));

    return pokemon;
  }
}
