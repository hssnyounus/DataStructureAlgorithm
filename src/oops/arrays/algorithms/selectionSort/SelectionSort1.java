package oops.arrays.algorithms.selectionSort;

import oops.arrays.algorithms.PrintArray;

public class SelectionSort1 extends PrintArray {

  public static void main(String[] args) {

    int[] arr = {3, 5, 2, 4, 1, 6, 7};
    int length = arr.length;
    SelectionSort1 selectionSort = new SelectionSort1();
    System.out.println("original array");
    selectionSort.printArray(arr);
    selectionSort(arr, length);
    System.out.println("Sorted Array");
    selectionSort.printArray(arr);
  }

  public static void selectionSort(int[] arr, int length) {

    int minVal, tempVal;
    for (int minIndex = 0; minIndex < length; minIndex++) {

      minVal = minIndex;

      for (int maxIndex = minIndex + 1; maxIndex < length; maxIndex++) {

        if (arr[maxIndex] < arr[minVal]) {
          minVal = maxIndex;
        }

      }

      tempVal = arr[minIndex];
      arr[minIndex] = arr[minVal];
      arr[minVal] = tempVal;

    }
  }
}