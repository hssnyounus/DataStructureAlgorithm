package oops.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SelectionSort {


  public static void main(String[] args) {
//    SelectionSort.doSelectionSort();
//    SelectionSort.doSelectionSortTow();
//    SelectionSort.doSelectionSortWithInteger();
//    SelectionSort.doSelectionSortWithString();
//    SelectionSort.selectionSort();
//    SelectionSort.selectionSort1();
//    SelectionSort.selectionSort2();
//    SelectionSort.insertionSort3();
    SelectionSort.selectionSort5();
  }


  public static void doSelectionSort() {
    int[] elements = {38, 53, 9, 18, 6, 62, 13};

    int min, temp = 0;

    //   for originel value like number of array inside value
    for (int i = 0; i < elements.length; i++) {

      min = i;

//        this loop for indexing tracing
      for (int j = i + 1; j < elements.length; j++) {

        if (elements[j] < elements[min]) {

          min = j;
        }
      }
      temp = elements[i];
      elements[i] = elements[min];
      elements[min] = temp;
      System.out.println(elements[i]);
    }
  }

  public static void doSelectionSortWithInteger() {
    int[] arrays = {38, 53, 9, 18, 6, 62, 13};
    int minValue, temp = 0;

    for (int index = 0; index < arrays.length; index++) {

      minValue = index;

      for (int nextIndex = index + 1; nextIndex < arrays.length; nextIndex++) {

        if (arrays[nextIndex] < arrays[minValue]) {

          minValue = nextIndex;

        } else {

          System.out.println("else part excute");

        }

      }
      temp = arrays[index];
      arrays[index] = arrays[minValue];
      arrays[minValue] = temp;
    }
    for (int el : arrays) {
      System.out.println(el);
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

  public static void selectionSort() {
    int[] selections = {38, 53, 9, 18, 6, 62, 13};
    int minValue, temp = 0;
    for (int zeroIndex = 0; zeroIndex < selections.length; zeroIndex++) {
      minValue = zeroIndex;

      for (int firstIndex = zeroIndex + 1; firstIndex < selections.length; firstIndex++) {
        if (selections[firstIndex] < selections[minValue]) {
          minValue = firstIndex;
        }
      }
      temp = selections[zeroIndex];
      selections[zeroIndex] = selections[minValue];
      selections[minValue] = temp;
    }
    for (int el : selections) {
      System.out.println(el);
    }
  }

  public static void selectionSort1() {

    int[] selections = {5, 4, 1, 2, 3};
    int length = selections.length;
    int tempValue, minValue;

    for (int leftIndex = 0; leftIndex < length; leftIndex++) {

      minValue = leftIndex;

      for (int rightIndex = leftIndex + 1; rightIndex < length; rightIndex++) {

        if (selections[rightIndex] < selections[minValue]) {

          minValue = rightIndex;

        }

        if (minValue != leftIndex) {

          tempValue = selections[rightIndex];
          selections[rightIndex] = selections[minValue];
          selections[minValue] = tempValue;

        }
      }

    }

  }

  public static void selectionSort2() {

    int[] selections = {5, 4, 1, 2, 3};
    int n = selections.length;
    int minVal, tempVal;
    for (int minIndex = 0; minIndex < n; minIndex++) {

      minVal = minIndex;

      for (int maxIndex = minIndex + 1; maxIndex < n; maxIndex++) {

        if (selections[maxIndex] < selections[minVal]) {

          minVal = maxIndex;
        }
      }

      tempVal = selections[minIndex];
      selections[minIndex] = selections[minVal];
      selections[minVal] = tempVal;

    }
    Arrays.stream(selections).forEach(el -> System.out.println(el));
  }


  public static void insertionSort3() {

    int[] selections = {5, 4, 1, 2, 3};
    int n = selections.length;
    int minVal, tempVal;
    for (int minIndex = 0; minIndex < n; minIndex++) {

      minVal = minIndex;

      for (int maxIndex = minIndex + 1; maxIndex < n; maxIndex++) {

        if (selections[maxIndex] < selections[minVal]) {

          minVal = maxIndex;
        }

      }
      tempVal = selections[minIndex];
      selections[minIndex] = selections[minVal];
      selections[minVal] = tempVal;

    }
    Arrays.stream(selections).forEach(el-> System.out.println(el));
  }


  public static void selectionSort5(){

    int[] selections = {5,3,2,7,1,6};
    int n = selections.length;
    int minVal,  tempVal;

    for (int minIndex = 0; minIndex<n; minIndex++){

      minVal = minIndex;

      for (int maxIndex = minIndex+1; maxIndex<n; maxIndex++){

        if (selections[maxIndex]< selections[minVal]){

          minVal = maxIndex;

        }
      }

      tempVal = selections[minIndex];
      selections[minIndex] = selections[minVal];
      selections[minVal] = tempVal;

    }
    for (int el: selections){
      System.out.println(el);
    }
  }
}
