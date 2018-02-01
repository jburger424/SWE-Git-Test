package com.company;

public class Adder {
  public int add(String numbers){
    int sum = 0;
    String[] splitNums = numbers.split(",");
    for(String numStr : splitNums){
      if(numStr.length()>0) {
        int num = Integer.parseInt(numStr);
        sum += num;
      }
    }
    return sum;
  }
}
