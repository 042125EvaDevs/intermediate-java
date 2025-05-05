package com.example.exceptionhandling;


import org.w3c.dom.ls.LSOutput;

import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      try {

        System.out.println("How many days are in a year?");
        Integer value = scanner.nextInt(); // throws InputMismatchException

        Double divisor = createRandomNull();

        System.out.println("Divisor " + divisor);

        Integer result = value / divisor.intValue(); // Null pointer exception thrown

        System.out.println(String.format("%d Divided %d equals %d", value, divisor, result));
        System.out.println("There are " + result + " days.");

      } catch (InputMismatchException e) {

        System.out.println(e.getLocalizedMessage());

      } catch (IllegalFormatConversionException e){
        System.out.println(e.getLocalizedMessage());
      } catch(ArithmeticException e) {
        System.out.println(e);

      } catch (NullPointerException e) {
        throw new RuntimeException(e);
      } catch(Exception e) {
        System.out.println(e);
      }

    }

  private static Double createRandomNull() {
    Double num =  Math.floor(Math.random() * 10);
    return  num % 2 == 0 ? num : null;
  }


}
