package com.redi.j2;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.lang.reflect.Method;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class FindElementTest {


  @ParameterizedTest
  @MethodSource("findFirstArgs")
  void shouldFindFirstInArray(String[] elements, String element, int expected) {
    assertEquals(expected, FindElement.findFirstInArray(elements, element));
  }

  @ParameterizedTest
  @MethodSource("findLastArgs")
  void shouldFindLastInArray(String[] elements, String element, int expected) throws Exception {
    assertEquals(expected, findLastInArray().invoke(null, elements, element));
  }

  @ParameterizedTest
  @MethodSource("findFirstArgs")
  void shouldFindFirstInList(String[] elements, String element, int expected) throws Exception {
    assertEquals(expected,
        findFirstInList().invoke(null, stream(elements).collect(toList()), element));
  }

  @ParameterizedTest
  @MethodSource("findLastArgs")
  void shouldFindLastInList(String[] elements, String element, int expected) throws Exception {
    assertEquals(expected,
        findLastInList().invoke(null, stream(elements).collect(toList()), element));
  }

  public static Stream<Arguments> findFirstArgs() {
    return Stream.of(
        Arguments.of(new String[]{}, "", -1),
        Arguments.of(new String[]{}, "1", -1),
        Arguments.of(new String[]{"1"}, "1", 0),
        Arguments.of(new String[]{"5", "1", "2", "3", "4"}, "not find", -1),
        Arguments.of(new String[]{"5", "1", "2", "3", "4"}, "4", 4),
        Arguments.of(new String[]{"5", "1", "2", "3", "4"}, "5", 0),
        Arguments.of(new String[]{"5", "1", "2", "3", "4"}, "2", 2),
        Arguments.of(new String[]{"5", "1", "2", "3", "4", "5"}, "5", 0),
        Arguments.of(new String[]{"5", "1", "2", "3", "4", "2"}, "2", 2)
    );
  }

  public static Stream<Arguments> findLastArgs() {
    return Stream.of(
        Arguments.of(new String[]{}, "", -1),
        Arguments.of(new String[]{}, "1", -1),
        Arguments.of(new String[]{"1"}, "1", 0),
        Arguments.of(new String[]{"5", "1", "2", "3", "4"}, "not find", -1),
        Arguments.of(new String[]{"5", "1", "2", "3", "4"}, "4", 4),
        Arguments.of(new String[]{"5", "1", "2", "3", "4"}, "5", 0),
        Arguments.of(new String[]{"5", "1", "2", "3", "4"}, "2", 2),
        Arguments.of(new String[]{"5", "1", "2", "3", "4", "5"}, "5", 5),
        Arguments.of(new String[]{"5", "1", "2", "3", "4", "2", "3", "4",}, "2", 5)
    );
  }

  private Method findLastInList() throws Exception {
    return FindElement.class.getMethod("findLastInList", List.class, String.class);
  }

  private Method findLastInArray() throws Exception {
    return FindElement.class.getMethod("findLastInArray", String[].class, String.class);
  }

  private Method findFirstInList() throws Exception {
    return FindElement.class.getMethod("findFirstInList", List.class, String.class);
  }
}