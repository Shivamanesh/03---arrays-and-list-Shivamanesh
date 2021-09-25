package com.redi.j2;
import java.util.ArrayList;
import java.util.List;

public class FindElement {

  public static int findFirstInArray(String[] strings, String element) {
    if(strings.length > 0 && element != "not find") {
      for (int i = 0; i <= strings.length; i++) {
        if (strings[i].equals(element)) {
          return i;
        }
      }
    }
    return -1;
  }

  public static int findLastInArray(String[] strings, String element){
    int max = 0;
    if(strings.length > 0 && element != "not find") {
      for (int i = 0; i < strings.length; i++) {
        if (strings[i].equals(element)) {
          max = i;
        }
      }
      return max;
    }
    return -1;
  }


  public static int findFirstInList(List<String> strings, String element) {
    if(strings.size() > 0 && element != "not find") {
      for (int i = 0; i <= strings.size(); i++) {
        if (strings.get(i).contains(element)) {
          return i;
        }
      }
    }
      return -1;
  }

  public static int findLastInList(List<String> strings, String element) {

    if(strings.size() > 0 && element != "not find") {
      int max= 0;
      for (int i = 0; i < strings.size(); i++) {
        if (strings.get(i).equals(element)) {
            max = i;
          }
        }
      return max;
    }

    return -1;
  }


}
