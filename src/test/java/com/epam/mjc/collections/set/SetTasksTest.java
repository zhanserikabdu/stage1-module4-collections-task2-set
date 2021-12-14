package com.epam.mjc.collections.set;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SetTasksTest {
  @Test
  public void testMethodTask1() {
    Task1 task1 = new Task1();

    String actual = task1.implement();

    String expected = "Monday Thursday Friday Sunday Wednesday Tuesday Saturday";
    assertEquals(expected, actual);
  }

  @Test
  public void testMethodTask2() {
    Task2 task2 = new Task2();

    String actual = task2.implement();

    assertFalse(actual.isEmpty());
  }

  @Test
  public void testMethodTask3() {
    Task3 task3 = new Task3();

    String actual = task3.implement();

    String expected = "Red Black";
    assertEquals(expected, actual);
  }

  @Test
  public void testMethodTask4() {
    Task4 task4 = new Task4();

    String actual = task4.implement();

    String expected = "Friday Monday Saturday Sunday Thursday Tuesday Wednesday";
    assertEquals(expected, actual);
  }

  @Test
  public void testMethodTask5() {
    Task5 task5 = new Task5();

    String[] actual = task5.implement().split(" ");

    Arrays.stream(actual)
        .map(Integer::parseInt)
        .forEach(integer -> assertTrue(integer < 10));
  }
}