package com.redi.j2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SecondSmallestTest {

  private static final Random RANDOM = new Random();

  public static Stream<Arguments> secondSmallest() {
    return IntStream.range(1, 100)
        .mapToObj(x -> {
          final int[] ints = IntStream.rangeClosed(1, x)
              .map(any -> -500 + RANDOM.nextInt(1000))
              .toArray();
          final List<Integer> distinct = Arrays.stream(ints).distinct().sorted().boxed()
              .collect(Collectors.toList());
          return Arguments.of(ints, distinct.size() == 1 ? distinct.get(0) : distinct.get(1));
        });
  }

  @ParameterizedTest
  @MethodSource("secondSmallest")
  void shouldReturnSecondSmallest(int[] intArray, int secondSmallest) {
    assertEquals(SecondSmallest.secondSmallest(intArray), secondSmallest);
  }
}