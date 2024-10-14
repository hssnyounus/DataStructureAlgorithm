package oops.arrays;

import java.util.Random;

public class QuickSort {

  public static void main(String[] args) {

    int[] quicks = {5, 3, 2, 7, 1, 6};

    int length = quicks.length;
    System.out.println("Original Array:");
    printArray(quicks);

    quickSort1(quicks, 0, length - 1);


    System.out.println("Sorted Array:");
    printArray(quicks);
  }

  public static void quickSort1(int[] arr, int low, int high) {

    if (low < high) {

      int pivotIndex = partition(arr, low, high);

      if (low < pivotIndex - 1) {

        quickSort1(arr, low, pivotIndex - 1);

      }
      if (pivotIndex < high) {

        quickSort1(arr, pivotIndex, high);
      }

    }
  }

  static int partition(int[] arr, int leftIndex, int rightIndex) {
//    int pivot = arr[(leftIndex+rightIndex)/2];
//    int pivot = arr[(leftIndex + rightIndex) / 2];
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


  static int partition1(int[] arr, int leftIndex, int rightIndex) {

    int pivot = arr[leftIndex];

    while (leftIndex < rightIndex) {

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

  static void quickSort2(int[] arr, int low, int high) {

    int pivotIndex = partition1(arr, low, high);
    if (low < pivotIndex - 1) {
      quickSort2(arr, low, pivotIndex - 1);
    }
    if (pivotIndex < high) {

      quickSort2(arr, pivotIndex - 1, high);

    }


  }

  private static void printArray(int[] quicks) {
    for (int el : quicks) {
      System.out.println(el + " ");
    }
    System.out.println();
  }

}
