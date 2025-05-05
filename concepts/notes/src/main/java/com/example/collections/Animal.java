package com.example.collections;

import java.util.HashMap;

public class Animal {

  private String name;

  enum Sounds {
    BARK,
    MEOW,
    NEIGH
  }

  public Animal(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static void main(String[] args) {
    HashMap<Sounds, Animal> animalSounds = new HashMap<>();

    animalSounds.put(Sounds.BARK, new Animal("dog"));
    animalSounds.put(Sounds.MEOW, new Animal("cat"));
    animalSounds.put(Sounds.NEIGH, new Animal("horse"));

    Animal animal = animalSounds.get(Sounds.NEIGH);

    System.out.println(animal);
  }

  @Override
  public String toString() {
    return "Animal{" +
      "name='" + name + '\'' +
      '}';
  }
}
