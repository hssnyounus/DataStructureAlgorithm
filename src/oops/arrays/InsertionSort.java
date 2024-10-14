package oops.arrays;

import java.util.Arrays;

public class InsertionSort {


  public static void main(String[] args) {
//    SelectionSort.doSelectionSortTow();
//    InsertionSort.doInsertionSortWithInteger();
//    InsertionSort.insertionSort();
//    InsertionSort.insertionSort1();
//    InsertionSort.insertionSort2();
    InsertionSort.insertionSort6();
  }


  public static void doInsertionSortWithInteger() {
    int[] arrays = {5, 61, 47, 21, 17, 8, 9, 12, 3,};
    int tempValue, prevIndex;

    for (int index = 1; index < arrays.length; index++) {

      tempValue = arrays[index];

      prevIndex = index;


      while (prevIndex > 0 && arrays[prevIndex - 1] > tempValue) {

        arrays[prevIndex] = arrays[prevIndex - 1];
        prevIndex -= 1;

      }
      arrays[prevIndex] = tempValue;
    }
    for (int i = 0; i < arrays.length; i++) {
      System.out.println(arrays[i]);
    }


  }

  public static void doSelectionSortWithString() {
    String[] arrays = {"blue", "red", "green", "black", "white"};
    Arrays.sort(arrays);
    System.out.println(arrays[0]);
    int minValue;
    String temp = "";

    for (int index = 0; index < arrays.length; index++) {

      minValue = index;

      for (int nextIndex = index + 1; nextIndex < arrays.length; nextIndex++) {

        if (arrays[nextIndex].compareTo(arrays[minValue]) < 0) {

          minValue = nextIndex;

        } else {

          System.out.println("else part excute");

        }

      }
      temp = arrays[index];
      arrays[index] = arrays[minValue];
      arrays[minValue] = temp;
      System.out.println(arrays[index]);
    }


  }

  public static void insertionSort() {

    String[] insertions = {"Z", "A", "C", "B", "D"};
//    int[] insertions = {5, 61, 47, 21, 17, 8, 9, 12, 3,};
//    int temp, prevIndex = 0;
    String temp = "";
    int prevIndex = 0;
    for (int firstIndex = 1; firstIndex < insertions.length; firstIndex++) {

      temp = insertions[firstIndex];
      prevIndex = firstIndex;
      while (prevIndex > 0 && insertions[prevIndex - 1].compareTo(temp) > 0) {
        insertions[prevIndex] = insertions[prevIndex - 1];
        prevIndex -= 1;
      }
      insertions[prevIndex] = temp;
    }
    for (String el : insertions) {
      System.out.println(el);
    }
  }

  public static void insertionSort1() {

    int[] insertions = {5, 4, 1, 2, 3};
    int length = insertions.length;
    int tempValue, prevIndex;

    for (int firstIndex = 1; firstIndex < length; firstIndex++) {

      tempValue = insertions[firstIndex];
      prevIndex = firstIndex;

      while (prevIndex > 0 && insertions[prevIndex - 1] > tempValue) {

        insertions[prevIndex] = insertions[prevIndex - 1];
        prevIndex -= 1;

      }

      insertions[prevIndex] = tempValue;

    }
    Arrays.stream(insertions).forEach(el -> System.out.println(el));

  }

  public static void insertionSort2() {
    int[] insertions = new int[]{1, 2, 3, 4,};
    int length = insertions.length;
    int tempValue, prevIndex;

    for (int firstIndex = 1; firstIndex < length; firstIndex++) {

      tempValue = insertions[firstIndex];
      prevIndex = firstIndex;

      while (prevIndex > 0 && insertions[firstIndex - 1] > tempValue) {

        insertions[prevIndex] = insertions[prevIndex - 1];
        prevIndex -= 1;

      }

      insertions[prevIndex] = tempValue;
    }
    Arrays.stream(insertions).forEach(el -> System.out.println(el));
  }

  public static void insertionSort3() {

    int[] insertions = new int[]{1, 2, 3, 4,};
    int length = insertions.length;
    int tempValue, prevIndex;

    for (int firstIndex = 1; firstIndex < length; firstIndex++) {

      tempValue = insertions[firstIndex];
      prevIndex = firstIndex;

      while (prevIndex > 0 && insertions[prevIndex - 1] > tempValue) {

        insertions[prevIndex] = insertions[prevIndex - 1];
        prevIndex -= 1;

      }
      insertions[prevIndex] = tempValue;
    }
  }

  public static void insertionSort4() {

    int[] insertions = new int[]{1, 2, 3, 4};
    int length = insertions.length;
    int tempVal, prevIndex;

    for (int firstIndex = 1; firstIndex < length; firstIndex++) {

      tempVal = insertions[firstIndex];
      prevIndex = firstIndex;

      while (prevIndex > 0 && insertions[prevIndex - 1] > tempVal) {

        insertions[prevIndex] = insertions[prevIndex - 1];
        prevIndex -= 1;

      }
      insertions[prevIndex - 1] = tempVal;

    }
  }

  public static void insertionSort5() {

    int[] insertions = new int[]{1, 2, 3, 4};
    int n = insertions.length;
    int tempVal, prevIndex;
    for (int firstIndex = 1; firstIndex < n; firstIndex++) {

      tempVal = insertions[firstIndex];
      prevIndex = firstIndex;

      while (prevIndex > 0 && insertions[prevIndex - 1] > tempVal) {

        insertions[prevIndex] = insertions[prevIndex - 1];
        prevIndex -= 1;
      }
      insertions[prevIndex] = tempVal;
    }
  }

  public static void insertionSort6(){

    int[] insertions = {5,3,2,7,1,6};
    int n = insertions.length;
    int tempVal, prevIndex;
    for (int nextIndex = 1;nextIndex<n; nextIndex++){

      tempVal = insertions[nextIndex];
      prevIndex = nextIndex;

      while (prevIndex> 0 && insertions[prevIndex - 1]> tempVal)
      {
        insertions[prevIndex] = insertions[prevIndex-1];
        prevIndex -=1;
      }
      insertions[prevIndex] = tempVal;
    }
    for(int el:insertions){
      System.out.println(el);
    }
  }











}
