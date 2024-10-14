package oops.arrays.algorithms.quickSort;

import java.util.Queue;

public class QuickSort1 {
  public static void main(String[] args) {
//    int[] arr = {5, 3, 1, 6, 2,7};
    int[] arr = {5, 3, 2, 7, 1, 6};
    int length = arr.length;

    System.out.println("Original Array:");
    printArray(arr);

//    quickSort(arr, 0, length - 1);
    quickSort(arr, 0, length - 1);


    System.out.println("Sorted Array:");
    printArray(arr);
  }

  public static void quickSort(int[] arr, int lowIndex, int highIndex) {

//    if (lowIndex < highIndex) {
//      int pivotIndex = partition(arr, lowIndex, highIndex);
//
//      if (lowIndex < pivotIndex - 1) {
//        quickSort(arr, lowIndex, pivotIndex - 1);
//      }
//      if (pivotIndex < highIndex) {
//        quickSort(arr, pivotIndex, highIndex);
//      }
//    }
    if (lowIndex < highIndex) {

      int pivotIndex = partition(arr, lowIndex, highIndex);

      if (lowIndex < pivotIndex - 1) {

        quickSort(arr, lowIndex, pivotIndex - 1);

      }
      if (pivotIndex < highIndex) {

        quickSort(arr, pivotIndex, highIndex);
      }

    }

  }

  private static int partition(int[] arr, int leftIndex, int rightIndex) {

//    int pivot = arr[(leftIndex+rightIndex)/2];
    int pivot = arr[leftIndex];

    while (leftIndex <= rightIndex) {

      while (arr[leftIndex] < pivot) {
        leftIndex++;
      }
      while (arr[rightIndex] > pivot) {
        rightIndex--;
      }
      if (leftIndex <= rightIndex) {

        int tempVal = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = tempVal;
        leftIndex++;
        rightIndex--;

      }
    }

    return leftIndex;
  }

  private static void printArray(int[] quicks) {
    for (int el : quicks) {
      System.out.println(el + " ");
    }
    System.out.println();
  }
}
