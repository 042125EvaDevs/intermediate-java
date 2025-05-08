package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class FrequencyCollector implements Collector<List<String>, List<String>, Map<String, Integer>> {

  /**
   * A function that creates and returns a new mutable result container.
   *
   * @return a function which returns a new, mutable result container
   */
  @Override
  public Supplier<List<String>> supplier() {
    return ArrayList::new;
  }

  /**
   * A function that folds a value into a mutable result container.
   *
   * @return a function which folds a value into a mutable result container
   */
  @Override
  public BiConsumer<List<String>, List<String>> accumulator() {
    return (accumulated, next) -> accumulated.addAll(next);
  }

  /**
   * A function that accepts two partial results and merges them.  The
   * combiner function may fold state from one argument into the other and
   * return that, or may return a new result container.
   *
   * @return a function which combines two partial results into a combined
   * result
   */
  @Override
  public BinaryOperator<List<String>> combiner() {
    return null;
  }

  /**
   * Perform the final transformation from the intermediate accumulation type
   * {@code A} to the final result type {@code R}.
   *
   * <p>If the characteristic {@code IDENTITY_FINISH} is
   * set, this function may be presumed to be an identity transform with an
   * unchecked cast from {@code A} to {@code R}.
   *
   * @return a function which transforms the intermediate result to the final
   * result
   */
  @Override
  public Function<List<String>, Map<String, Integer>> finisher() {
    return null;
  }

  /**
   * Returns a {@code Set} of {@code Collector.Characteristics} indicating
   * the characteristics of this Collector.  This set should be immutable.
   *
   * @return an immutable set of collector characteristics
   */
  @Override
  public Set<Characteristics> characteristics() {
    return Set.of();
  }
}
