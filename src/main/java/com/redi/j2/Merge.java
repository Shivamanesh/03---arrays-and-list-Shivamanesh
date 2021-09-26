package com.redi.j2;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Merge {


  public static int[] mergeArrays(int[] first, int[] second) {
    //TODO your code goes here
    int sizeOfMergedArray = first.length * 2;
    int merge[] = new int[sizeOfMergedArray];
    if(first.length != 0 && second.length != 0 ) {
      for (int i = 0; i < sizeOfMergedArray; i++) {
        if(i % 2 == 0){
          merge[i] = first[i - (1/2 * i)];
        }
        if(i % 2 != 0){
          merge[i] = second[(i-1) / 2];
        }
      }
    }
    return merge;
  }



  public static List<Integer> mergeLists(List<Integer> first, List<Integer> second) {
    //TODO your code goes here
    List<Integer> merge = new ArrayList<Integer>();
    if(first.size() != 0 && second.size() != 0) {
      for (int i = 0; i < first.size(); i++) {
        merge.add(first.get(i));
        merge.add(second.get(i));
      }
    }
    return merge;
  }

  public static void main(String[] args) {
    List<Integer> resultList = mergeLists(
            Arrays.asList(new Integer[]{1,2,3,4}),
            Arrays.asList(new Integer[]{1,2,3,4})
    );
    System.out.println(resultList);
  }

}