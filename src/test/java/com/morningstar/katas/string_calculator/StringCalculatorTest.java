package com.morningstar.katas.string_calculator;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class StringCalculatorTest {

  @Test
  public void anEmptyStringReturnsZero() {
    assertEquals(0, StringCalculator.calculateString(""));
  }
  
  @Test
  public void aSingleNumberReturnsTheValue() {
    assertEquals(5, StringCalculator.calculateString("5"));
  }
  
  @Test
  public void twoNumbersCommaDelimitedReturnsTheSum() {
    assertEquals(14, StringCalculator.calculateString("5,9"));
  }
  
  @Test
  public void twoNumbersNewlineDelimitedReturnsTheSum() {
    assertEquals(14, StringCalculator.calculateString("5\n9"));
  }
  
  @Test
  public void threeNumbersDelimitedEitherWayReturnsTheSum() {
    assertEquals(23, StringCalculator.calculateString("5\n9\n9"));
    assertEquals(23, StringCalculator.calculateString("5,9,9"));
  }
  
  @Test(expected=IllegalArgumentException.class)
  public void negativeNumbersThrowAnException() {
    StringCalculator.calculateString("-1");
  }
  
  @Test
  public void numbersGreaterThan1000AreIgnored() {
    assertEquals(23, StringCalculator.calculateString("5,9,1025,9"));
  }
  
  @Test
  public void findCommaDelimiter() {
    assertEquals(",", StringCalculator.findDelimiter("5,9,1025,9"));
  }
  
  @Test
  public void findNewLineDelimiter() {
    assertEquals("\n", StringCalculator.findDelimiter("5\n9\n1025\n9"));
  }
  
  @Test
  public void aStringWithNoDelimitersYieldsNull() {
    assertNull(StringCalculator.findDelimiter("5910259"));
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
