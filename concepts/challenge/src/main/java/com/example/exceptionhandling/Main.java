package com.example.exceptionhandling;


public class Main {

    public static void main(String[] args)  {

      /**
       *
       * 1. Basic try-catch
       * 2. Catch `ArithmeticException` and `NullPointerException`
       */

      try {

        int age = randomNumberLessThan(120);

        if (age < 18){
          throw new InvalidAgeException(age);
        }

        System.out.println("Age = " + age);

        int value = age / randomNumberLessThan(2);

        System.out.println("value = " + value);;

      }
      catch(ArithmeticException | NullPointerException e) {
        System.out.println("Catch block: " + e);
      }

      catch (InvalidAgeException error) {
        System.out.println(error.getMessage());
      }
      finally {
        System.out.println("We have reached the finally block");
      }


      /**
       *
       * Develop a file reader application that reads data from a file and processes it.
       * Implement the try-with-resources statement to ensure that file streams are
       * closed automatically, highlighting proper resource management
       */


         

         try {

    }

  private static int randomNumberLessThan(int n) {
    return (int) (Math.random() * n);
  }
}
