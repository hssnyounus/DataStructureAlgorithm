package oops.arrays;

import java.util.Iterator;

public class ArrayExample {
  public static void main(String[] args) {
    ArrayExample.doBubbleSort();
//    ArrayExample.doSelectionSort();
//    ArrayExample.doInsertion();
//    ArrayExample.doSelection();
  }

  static public void doSimpleArray() {
    try {
      int[][][] arr = new int[2][3][4];

      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
          for (int k = 0; k < arr[i][j].length; k++) {
            System.out.println(arr[i][j][k] + "");
          }
          System.out.println(arr[i][j] + "");
        }
        System.out.println();
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  static public void doBubbleAlgorithm() {
    int[] arr = {12, 24, 34, 44, 54};
    int temp;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr.length - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + i] = temp;

        }
      }
    }
    for (int swap = 0; swap < arr.length; swap++) {
      System.out.println(arr[swap] + "");
    }
  }

  static public void doBubbleSort() {
    int[] bubbles = new int[]{12, 24, 34, 44, 54};
    int temp;
    for (int index = 0; index < bubbles.length; index++) {
//      System.out.println(bubbles.length + 1);
      for (int secondIndex = 0; secondIndex < bubbles.length - 1; secondIndex++) {
        Integer i = secondIndex;
        Integer si = secondIndex + 1;
//        System.out.println("secondIndex less => " + i);
//        System.out.println("secondIndex plus=> " + si);
        if (bubbles[secondIndex] > bubbles[secondIndex + 1]) {
          temp = bubbles[secondIndex];
          bubbles[secondIndex] = bubbles[secondIndex + 1];
          bubbles[secondIndex + 1] = temp;
        }
      }
    }
    for (int swap = 0; swap < bubbles.length; swap++) {
      System.out.println(bubbles[swap]);
    }
  }

//  static public void doSelectionSort() {
////    int[] selections = {38, 52, 9, 18, 12, 24, 36};
//    String[] selections = {"Z", "A", "R", "B", "U", "C"};
//    for (String el : selections) {
//      System.out.println("first time => " + el);
//    }
////    int min, temp = 0;
//    int min;
//    String temp = "";
//    for (int firstIndex = 0; firstIndex < selections.length; firstIndex++) {
//      min = firstIndex;
//      for (int secondIndex = firstIndex + 1; secondIndex < selections.length; secondIndex++) {
////        if (selections[secondIndex] < selections[min]) {
////          min = secondIndex;
////        }
//        if (selections[secondIndex].compareTo(selections[min])<0) {
//          min = secondIndex;
//        }
//      }
//      temp = selections[firstIndex];
//      selections[firstIndex] = selections[min];
//      selections[min] = temp;
//
//    }
//    for (int i = 0; i < selections.length; i++) {
//      System.out.println(selections[i]);
//    }
//    for (String el : selections) {
//      System.out.println("after sorting =>" + el);
//    }
//
//
//  }


//  static public void doInsertion() {
//    int[] insertion = {38, 52, 9, 18, 12, 24, 36};
//    int temp, secondIndex;
//    for (int firstIndex = 1; firstIndex < insertion.length; firstIndex++) {
//        temp = insertion[firstIndex];
//        secondIndex = firstIndex;
//        while (secondIndex>0 && insertion[secondIndex-1]>temp){
//          insertion[secondIndex] = insertion[secondIndex-1];
//          secondIndex -=1;
//        }
//        insertion[secondIndex] = temp;
//    }
//    for (int el:insertion){
//      System.out.println(el);
//    }
//  }

  static public void doSelection() {
    int[] selection = {38, 52, 9, 18, 12, 24, 36};
    int min;
    int temp = 0;
    for (int el : selection) {
      System.out.println(el);
    }
    for (int index = 0; index < selection.length; index++) {
      min = index;
      for (int secondIndex = index + 1; secondIndex < selection.length; secondIndex++) {
        if (selection[secondIndex] < selection[min]) {
          min = secondIndex;
        }
      }
      temp = selection[index];
      selection[index] = selection[min];
      selection[min] = temp;
    }
    for (int el : selection) {
      System.out.println(el);
    }


  }


}
