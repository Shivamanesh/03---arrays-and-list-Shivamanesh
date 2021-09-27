package com.redi.j2;
import java.util.ArrayList;

public class SecondSmallest<secondSmallest> {

  public static int secondSmallest(int[] intArray) {
    //TODO your code goes here
    for(int i = 0; i < intArray.length; i++){
      for(int j = intArray.length -1; j > i; j--){
        if(intArray[i] > intArray[j]){
          int help = intArray[i];
          intArray[i] = intArray[j];
        }
      }
    }
    int secondSmallest = 0;
    for(int k = 0; k < intArray.length; k++){
      if(intArray[k+1] > intArray[k]){
        secondSmallest = intArray[k+1];
      }
    }

    return secondSmallest;
  }
    //return Integer.MAX_VALUE;
}
