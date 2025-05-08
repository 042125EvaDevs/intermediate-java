package com.example;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;

public class WordManipulation {


  public Map<String, Integer> wordFrequency(String fileName) {
    Map<String, Integer> frequency = new HashMap<>();
    String url = getClass().getResource(fileName).getFile();
    try (BufferedReader reader = new BufferedReader(new FileReader(url))) {
      String line;
      while ((line = reader.readLine()) != null) {

//        Arrays.asList(line.split("\\W")).stream()
//          .map(String::toLowerCase)
//          .collect(new )

      }
    } catch (FileNotFoundException e) {
      throw new RuntimeException(e);
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return null;
  }

  public static void main(String[] args) {

//    FileReader reader = new FileReader();

//    String content = reader.read("/lorem.txt");

//    Predicate<String> isWord = word -> word.matches("\\w");
    Function<String, List<String>> onlyWords = (line) -> Arrays.asList(line.split("\\W"));

    Map<String, Integer> counts = new HashMap<>();


    Consumer<String> addToMap = (word) -> {

      int wordCount = counts.getOrDefault(word, 0);
      counts.put(word, wordCount + 1);
    };

//    BiConsumer<>

//    Arrays.stream(content.split("\\n"))
//      .filter(String::isBlank)
//      .map(String::toLowerCase)
//      .map(onlyWords)
//      .collect(
//        new HashMap<String, Integer>(),
//
//
//      )
//      .forEach(addToMap);


//    System.out.println(content);
  }
}
