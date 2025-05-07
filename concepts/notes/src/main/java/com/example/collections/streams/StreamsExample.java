package com.example.collections.streams;

import java.util.List;

public class StreamsExample {


  public List<Character> characters  = List.of('a', '-', 'c', '&', 'e');


  public static void main(String[] args) {

    StreamsExample s = new StreamsExample();

    List<Character> alphabeticCharacters = s.characters.stream()
      .filter(Character::isAlphabetic)
      .toList();
//      .collect(Collectors.toList());

    System.out.println("alphabeticCharacters = " + alphabeticCharacters);


  }

}
