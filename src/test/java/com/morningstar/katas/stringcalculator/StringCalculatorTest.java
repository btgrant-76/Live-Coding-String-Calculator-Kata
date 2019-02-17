package com.morningstar.katas.stringcalculator;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

  @Disabled
  @Test
  public void anEmptyStringReturnsZero() {
    assertEquals(0, StringCalculator.calculateString(""));
  }

  @Disabled
  @Test
  public void aSingleNumberReturnsTheValue() {
    assertEquals(5, StringCalculator.calculateString("5"));
  }

  @Disabled
  @Test
  public void twoNumbersCommaDelimitedReturnsTheSum() {
    assertEquals(14, StringCalculator.calculateString("5,9"));
  }

  @Disabled
  @Test
  public void twoNumbersNewlineDelimitedReturnsTheSum() {
    assertEquals(14, StringCalculator.calculateString("5\n9"));
  }

  @Disabled
  @Test
  public void threeNumbersDelimitedEitherWayReturnsTheSum() {
    assertEquals(23, StringCalculator.calculateString("5\n9\n9"));
    assertEquals(23, StringCalculator.calculateString("5,9,9"));
  }

  @Disabled
  @Test
  public void negativeNumbersThrowAnException() {
    Arrays.asList("-1", "5,-1,9")
        .stream()
        .forEach((numString) -> {
          try {
            StringCalculator.calculateString(numString);
            fail("an exception should have been thrown for " + numString);
          } catch (IllegalArgumentException e) {
            assertEquals("negative numbers aren't allowed:  -1", e.getMessage());
          }
        });
  }

  @Disabled
  @Test
  public void numbersGreaterThan1000AreIgnored() {
    assertEquals(23, StringCalculator.calculateString("5,9,1025,9"));
  }

  @Disabled
  @Test
  public void aSingleCharDelimiterCanBeDefinedOnTheFirstLine() {
    assertEquals(23, StringCalculator.calculateString("#\n5#9#9"));
  }

  @Disabled
  @Test
  public void AMultiCharDelimiterCanBeDefinedOnTheFirstLine() {
    assertEquals(23, StringCalculator.calculateString("[###]\n5###9###9"));
  }

  @Disabled
  @Test
  public void manySingleOrMultiCharDelimitersCanBeDefined() {
    assertEquals(23, StringCalculator.calculateString("[|||][$$]\n5|||9$$9"));
  }

}
