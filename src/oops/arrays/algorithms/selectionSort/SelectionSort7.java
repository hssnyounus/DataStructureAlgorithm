package oops.arrays.algorithms.selectionSort;

import oops.arrays.algorithms.PrintArray;

public class SelectionSort7 extends PrintArray {

  public static void main(String[] args) {

    int[] arr = {3, 5, 2, 4, 1, 6, 7};
    int length = arr.length;
    SelectionSort7 selection = new SelectionSort7();
    System.out.println("original array");
    selection.printArray(arr);
    selectionSort(arr, length);
    System.out.println("Sorted Array");
    selection.printArray(arr);
  }

  public static void selectionSort(int[] arr, int length){
    int minVal, tempVal;
    for (int leftIndex = 0; leftIndex< length; leftIndex++){
      minVal = leftIndex;
      for (int rightIndex = leftIndex+1; rightIndex< length; rightIndex++){
          if (arr[rightIndex] < arr[minVal]){
            tempVal =arr[rightIndex];
            arr[rightIndex] = arr[minVal];
            arr[minVal] = tempVal;
          }
      }
    }
  }
}