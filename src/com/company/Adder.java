package com.company;

public class Adder {
  public int add(String numbers){
    if(numbers.length() == 0) return 0;
    if(numbers.indexOf(' ') == -1){
      return Integer.parseInt(numbers);
    }
    return -1;
  }
}
