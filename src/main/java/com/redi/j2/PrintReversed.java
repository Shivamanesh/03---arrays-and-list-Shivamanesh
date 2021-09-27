package com.redi.j2;

import java.util.List;
import java.util.ArrayList;

public class PrintReversed {

  public static void printReversedArray(int[] intArray) {
    //TODO your code goes here
    //ArrayList<Integer> reversedArray = new ArrayList<>(intArray.length);
    //int[] reversedArray = new int[intArray.length];
    //int j = 0;
    System.out.print("{");
    //if(intArray.length > 0) {
      for (int i = intArray.length -1; i >= 0; i--) {
        System.out.print(intArray[i]);
        //reversedArray[j] = intArray[i];
        //j++;
        if(i > 0){
          System.out.print(",");
        }
      }

      System.out.print("}");

  }

  public static void printReversedList(List<Integer> intList) {
    int n = intList.size();
    System.out.print("{");
    for(int i = n-1; i >= 0; i--){
      System.out.print( intList.get(i) );
      if(i > 0){
        System.out.print(",");
      }
    }
    System.out.print("}");
  }
}