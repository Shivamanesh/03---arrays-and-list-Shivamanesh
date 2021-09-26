package com.redi.j2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrintReversedTest {

  private ByteArrayOutputStream outputStream;

  @BeforeEach
  public void setUp() {
    outputStream = new ByteArrayOutputStream();
    System.setOut(new PrintStream(outputStream));
  }

  @AfterEach
  void tearDown() throws IOException {
    outputStream.close();
  }

  @Test
  void shouldPrintReversedArray() {
    PrintReversed.printReversedArray(new int[]{1, 2, 3, 4, 5});

    assertEquals(outputStream.toString().strip(), "{5,4,3,2,1}");
  }

  @Test
  void shouldPrintReversedArrayOne() {
    PrintReversed.printReversedArray(new int[]{1});

    assertEquals(outputStream.toString().strip(), "{1}");
  }

  @Test
  void shouldPrintReversedArrayEmpty() {
    PrintReversed.printReversedArray(new int[]{});

    assertEquals(outputStream.toString().strip(), "{}");
  }

  @Test
  void shouldPrintReversedArrayMixed() {
    PrintReversed.printReversedArray(new int[]{4, 12, -4, -8, 11, 6});

    assertEquals(outputStream.toString().strip(), "{6,11,-8,-4,12,4}");
  }

  @Test
  void shouldPrintReversedList() throws Exception {
    printReversedList().invoke(null, List.of(1, 2, 3, 4, 5));

    assertEquals(outputStream.toString().strip(), "{5,4,3,2,1}");
  }

  @Test
  void shouldPrintReversedListOne() throws Exception {
    printReversedList().invoke(null, List.of(1));

    assertEquals(outputStream.toString().strip(), "{1}");
  }

  @Test
  void shouldPrintReversedListEmpty() throws Exception {
    printReversedList().invoke(null, List.of());

    assertEquals(outputStream.toString().strip(), "{}");
  }

  @Test
  void shouldPrintReversedListMixed() throws Exception {
    printReversedList().invoke(null, List.of(4, 12, -4, -8, 11, 6));

    assertEquals(outputStream.toString().strip(), "{6,11,-8,-4,12,4}");
  }

  private Method printReversedList() throws Exception {
    return PrintReversed.class.getMethod("printReversedList", List.class);
  }

}