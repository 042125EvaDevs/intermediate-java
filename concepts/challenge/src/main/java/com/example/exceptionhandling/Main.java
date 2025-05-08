package com.example.exceptionhandling;


import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            String anything = null;
            anything.length();
            throw new ArithmeticException("Intentionally thrown exception");
        }
        catch(ArithmeticException | NullPointerException e) {
            System.out.println("Catch block: " + e);
        } finally {
            System.out.println("We have reached the finally");
        }
      /**
       *
       * Develop a file reader application that reads data from a file and processes it.
       * Implement the try-with-resources statement to ensure that file streams are
       * closed automatically, highlighting proper resource management
       */

    }
}
