package com.company;

public class Adder {
  public int add(String numbers){
    if(numbers.length() == 0) return 0;
    int sum = 0;
    String[] splitNums = numbers.split(",");
    for(String numStr : splitNums){
      int num = Integer.parseInt(numStr);
      sum += num;
    }
    return sum;
  }
}
