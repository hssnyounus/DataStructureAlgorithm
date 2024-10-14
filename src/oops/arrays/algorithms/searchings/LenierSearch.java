package oops.arrays.algorithms.searchings;

import java.util.Scanner;

public class LenierSearch {

  public static void main(String[] args) {
    int[] arr = {2,4,3,1,5,6,7};
    int length = arr.length;
    LenierSearch lenierSearch = new LenierSearch();
    lenierSearch.searching(arr,length);
  }
  private void searching(int[] arr, int length){
     int item = 13;
     boolean find = false;
     for (int index = 0; index< length; index++){

       if (arr[index] == item){
         System.out.println("found it" + item);
          find  = true;
       }
       if (!find){
         System.out.println("not found it given item");
       }
     }
  }
}
