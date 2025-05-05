package com.example.exceptionhandling;

import java.io.Closeable;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Class must implement {@link AutoCloseable} to be used
 * in try with resources:
 *
 */
public class Calculator implements AutoCloseable {

  private Scanner scanner = new Scanner(System.in);

  public Double prompt(String question) throws InvalidInputException {
    System.out.println(question);
    try {
      return Double.parseDouble(scanner.nextLine());
    } catch (InputMismatchException e) {
      throw new InvalidInputException("Input must be a number");
    }

  }

  public static void main(String[] args) {
    /**
     *
     * Create a set of custom exceptions(e.g., InvalidInputException, OperationFailedException)
     * and implement them in a calculator application.
     *
     */

    ;

    Double first = 0.0;
    Double second = null;
    Double result = 0d;
    Double dividend = 0d;

    try(Calculator calculator = new Calculator()) {
      first = calculator.prompt("what is the first number?");
      second = calculator.prompt("what is the second number?");

      result = calculator.add(first, second);
      dividend = calculator.divide(first, second);


    } catch (InvalidInputException | OperationFailedException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException(e);
    }

    System.out.println(String.format("first: %f\nsecond: %f\nsum: %f\ndividend: %f", first, second, result, dividend));
  }

  private Double divide(Double first, Double second) throws DivideByZeroException {
    if (second == 0d) {
      throw new DivideByZeroException();
    }
    return first / second;
  }

  private Double add(Double first, Double second) {
    return first + second;
  }

  /**
   *
   * @param quotient The numerator
   * @param divisor the denominator
   * @return
   */
  private Integer divide(int quotient, int divisor) throws OperationFailedException {
    if (divisor == 0) {
      throw new DivideByZeroException();
    }

    return quotient / divisor;
  }

  private Integer add(int first, int second) {
    return first + second;
  }

  /**
   * Closes this resource, relinquishing any underlying resources.
   * This method is invoked automatically on objects managed by the
   * {@code try}-with-resources statement.
   *
   * @throws Exception if this resource cannot be closed
   * @apiNote While this interface method is declared to throw {@code
   * Exception}, implementers are <em>strongly</em> encouraged to
   * declare concrete implementations of the {@code close} method to
   * throw more specific exceptions, or to throw no exception at all
   * if the close operation cannot fail.
   *
   * <p> Cases where the close operation may fail require careful
   * attention by implementers. It is strongly advised to relinquish
   * the underlying resources and to internally <em>mark</em> the
   * resource as closed, prior to throwing the exception. The {@code
   * close} method is unlikely to be invoked more than once and so
   * this ensures that the resources are released in a timely manner.
   * Furthermore it reduces problems that could arise when the resource
   * wraps, or is wrapped, by another resource.
   *
   * <p><em>Implementers of this interface are also strongly advised
   * to not have the {@code close} method throw {@link
   * InterruptedException}.</em>
   * <p>
   * This exception interacts with a thread's interrupted status,
   * and runtime misbehavior is likely to occur if an {@code
   * InterruptedException} is {@linkplain Throwable#addSuppressed
   * suppressed}.
   * <p>
   * More generally, if it would cause problems for an
   * exception to be suppressed, the {@code AutoCloseable.close}
   * method should not throw it.
   *
   * <p>Note that unlike the {@link Closeable#close close}
   * method of {@link Closeable}, this {@code close} method
   * is <em>not</em> required to be idempotent.  In other words,
   * calling this {@code close} method more than once may have some
   * visible side effect, unlike {@code Closeable.close} which is
   * required to have no effect if called more than once.
   * <p>
   * However, implementers of this interface are strongly encouraged
   * to make their {@code close} methods idempotent.
   */
  @Override
  public void close() throws Exception {
    this.scanner.close();
  }
}
