package com.morningstar.katas.string_calculator;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class StringCalculatorTest {

  @Ignore
  @Test
  public void anEmptyStringReturnsZero() {
    assertEquals(0, StringCalculator.calculateString(""));
  }
  
  @Ignore
  @Test
  public void aSingleNumberReturnsTheValue() {
    assertEquals(5, StringCalculator.calculateString("5"));
  }
  
  @Ignore
  @Test
  public void twoNumbersCommaDelimitedReturnsTheSum() {
    assertEquals(14, StringCalculator.calculateString("5,9"));
  }
  
  @Ignore
  @Test
  public void twoNumbersNewlineDelimitedReturnsTheSum() {
    assertEquals(14, StringCalculator.calculateString("5\n9"));
  }
  
  @Ignore
  @Test
  public void threeNumbersDelimitedEitherWayReturnsTheSum() {
    assertEquals(23, StringCalculator.calculateString("5\n9\n9"));
    assertEquals(23, StringCalculator.calculateString("5,9,9"));
  }
  
  @Ignore
  @Test(expected=IllegalArgumentException.class)
  public void negativeNumbersThrowAnException() {
    StringCalculator.calculateString("-1");
  }
  
  @Ignore
  @Test
  public void numbersGreaterThan1000AreIgnored() {
    assertEquals(23, StringCalculator.calculateString("5,9,1025,9"));
  }
  
  @Ignore
  @Test
  public void aSingleCharDelimiterCanBeDefinedOnTheFirstLine() {
    assertEquals(23, StringCalculator.calculateString("#\n5#9#9"));
  }
  
  @Ignore
  @Test
  public void AMultiCharDelimiterCanBeDefinedOnTheFirstLine() {
    assertEquals(23, StringCalculator.calculateString("[###]\n5###9###9"));
  }
  
  @Ignore
  @Test
  public void manySingleOrMultiCharDelimitersCanBeDefined() {
    assertEquals(23, StringCalculator.calculateString("[|||][$$]\n5|||9$$9"));
  }

}
