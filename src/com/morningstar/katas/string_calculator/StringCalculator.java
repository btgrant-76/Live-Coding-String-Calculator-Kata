package com.morningstar.katas.string_calculator;

public class StringCalculator {
  
  public static int calculateString(String calculateMe) {
    if (calculateMe.isEmpty()) {
      return 0;
    }
    
    final String delimiter = findDelimiter(calculateMe);
    
    if (delimiter != null) {
      String[] numbers = calculateMe.split(delimiter);
      int sum = 0;
      for (String number : numbers) {
        int num = Integer.parseInt(number); 
        if (num >= 1000) {
          num = 0;
        }
        sum += num;
      }
      
      return sum;
    }
    
//    if (calculateMe.indexOf(",") > 0) {
//      String[] numbers = calculateMe.split(",");
//      int sum = 0;
//      for (String number : numbers) {
//        int num = Integer.parseInt(number); 
//        if (num >= 1000) {
//          num = 0;
//        }
//        sum += num;
//      }
//      return sum;
//    }
//    
//    if (calculateMe.indexOf("\n") > 0) {
//      String[] numbers = calculateMe.split("\n");
//      int sum = 0;
//      for (String number : numbers) {
//        sum += Integer.parseInt(number);
//      }
//      return sum;
//    }
    
    int num = Integer.parseInt(calculateMe); 
    if (num < 0) {
      throw new IllegalArgumentException();
    }
    
    return num;
  }
  
  static String findDelimiter(String numbers) {
    if (numbers.indexOf(",") > 0) {
      return ",";
    }
    
    if (numbers.indexOf("\n") > 0) {
      return "\n";
    }
    
    return null;
  }
    

}
