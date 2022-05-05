package com.gfa.havadtoigabriella;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnimalTest {

  Animal animal;

  @BeforeEach
  public void setUp() {
    animal = new Animal();
  }

  @Test
  void eatMethodShouldReturnDecreasedHungerBy1() {
    int baseHunger = animal.hunger;
    animal.eat();
    assertThat(animal.hunger).isEqualTo(baseHunger - 1);
  }

  @Test
  void drinkMethodShouldReturnDecreasedThirstBy1() {
    int baseThirst = animal.thirst;
    animal.drink();
    assertThat(animal.thirst).isEqualTo(baseThirst - 1);
  }

  @Test
  void playMethodShouldIncreaseHungerAndThirstBy1() {
    int baseHunger = animal.hunger;
    int baseThirst = animal.thirst;
    animal.play();
    assertThat(animal.hunger).as("Hunger should have increased by 1").isEqualTo(baseHunger + 1);
    assertThat(animal.thirst).as("Thirst should have increased by 1").isEqualTo(baseThirst + 1);
  }
}