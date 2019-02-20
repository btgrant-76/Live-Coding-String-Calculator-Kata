package com.morningstar.katas.stringcalculator;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.stream.Stream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StringCalculatorTest {

  private StringCalculator testMe;

  @BeforeEach
  void setUp() {
    testMe = new StringCalculator();
  }

  @Disabled
  @Test
  void anEmptyStringReturnsZero() {
    assertEquals(0, testMe.calculateString(""));
  }

  @Disabled
  @Test
  void aSingleNumberReturnsTheValue() {
    assertEquals(5, testMe.calculateString("5"));
  }

  @Disabled
  @Test
  void twoNumbersCommaDelimitedReturnsTheSum() {
    assertEquals(14, testMe.calculateString("5,9"));
  }

  @Disabled
  @Test
  void twoNumbersNewlineDelimitedReturnsTheSum() {
    assertEquals(14, testMe.calculateString("5\n9"));
  }

  @Disabled
  @Test
  void threeNumbersDelimitedEitherWayReturnsTheSum() {
    assertEquals(23, testMe.calculateString("5\n9\n9"));
    assertEquals(23, testMe.calculateString("5,9,9"));
  }

  @Disabled
  @Test
  void negativeNumbersThrowAnException() {
    Stream.of("-1", "5,-1,9")
        .forEach(numString -> {
          try {
            testMe.calculateString(numString);
            fail("an exception should have been thrown for " + numString);
          } catch (IllegalArgumentException e) {
            assertEquals("negative numbers aren't allowed:  -1", e.getMessage());
          }
        });
  }

  @Disabled
  @Test
  void numbersGreaterThan1000AreIgnored() {
    assertEquals(23, testMe.calculateString("5,9,1025,9"));
  }

  @Disabled
  @Test
  void aSingleCharDelimiterCanBeDefinedOnTheFirstLine() {
    assertEquals(23, testMe.calculateString("#\n5#9#9"));
  }

  @Disabled
  @Test
  void aMultiCharDelimiterCanBeDefinedOnTheFirstLine() {
    assertEquals(23, testMe.calculateString("[###]\n5###9###9"));
  }

  @Disabled
  @Test
  void manySingleOrMultiCharDelimitersCanBeDefined() {
    assertEquals(23, testMe.calculateString("[|||][$$]\n5|||9$$9"));
  }

}
