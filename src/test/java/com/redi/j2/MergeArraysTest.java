package com.redi.j2;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Test;

class MergeArraysTest {

  @Test
  void shouldMergeArraysSimple() {
    assertArrayEquals(
        Merge.mergeArrays(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4}),
        new int[]{1, 1, 2, 2, 3, 3, 4, 4});
  }

  @Test
  void shouldMergeArraysEmpty() {
    assertArrayEquals(Merge.mergeArrays(new int[]{}, new int[]{}), new int[]{});
  }

  @Test
  void shouldMergeArraysSingle() {
    assertArrayEquals(Merge.mergeArrays(new int[]{1}, new int[]{2}), new int[]{1, 2});
  }

  @Test
  void shouldMergeArraysReversed() {
    assertArrayEquals(Merge.mergeArrays(new int[]{1, 2, 3}, new int[]{3, 2, 1}),
        new int[]{1, 3, 2, 2, 3, 1});
  }

  @Test
  void shouldMergeArraysDistinct() {
    assertArrayEquals(Merge.mergeArrays(new int[]{111, 10, 19}, new int[]{99, 32, 49}),
        new int[]{111, 99, 10, 32, 19, 49});
  }

  @Test
  void shouldMergeListsSimple() throws Exception {
    assertEquals(
        mergeLists().invoke(null, toList(new int[]{1, 2, 3, 4}), toList(new int[]{1, 2, 3, 4})),
        toList(new int[]{1, 1, 2, 2, 3, 3, 4, 4}));
  }

  @Test
  void shouldMergeListsEmpty() throws Exception {
    assertEquals(mergeLists().invoke(null, toList(new int[]{}), toList(new int[]{})), toList(new int[]{}));
  }

  @Test
  void shouldMergeListsSingle() throws Exception {
    assertEquals(mergeLists().invoke(null, toList(new int[]{1}), toList(new int[]{2})),
        toList(new int[]{1, 2}));
  }

  @Test
  void shouldMergeListsReversed() throws Exception {
    assertEquals(mergeLists().invoke(null, toList(new int[]{1, 2, 3}), toList(new int[]{3, 2, 1})),
        toList(new int[]{1, 3, 2, 2, 3, 1}));
  }

  @Test
  void shouldMergeListsDistinct() throws Exception {
    assertEquals(
        mergeLists().invoke(null, toList(new int[]{111, 10, 19}), toList(new int[]{99, 32, 49})),
        toList(new int[]{111, 99, 10, 32, 19, 49}));
  }

  private List<Integer> toList(int[] ints) {
    return Arrays.stream(ints).boxed().collect(Collectors.toList());
  }


  private Method mergeLists() throws Exception {
    return Merge.class.getMethod("mergeLists", List.class, List.class);
  }
}