package com.example.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

  public static void main(String[] args) {


    try (BufferedReader reader = new BufferedReader(new FileReader("lorem.txt"))) {
      String line;


    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
