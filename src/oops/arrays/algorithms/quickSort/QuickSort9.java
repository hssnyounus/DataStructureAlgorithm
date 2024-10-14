package oops.arrays.algorithms.quickSort;

import oops.arrays.algorithms.PrintArray;

import java.util.IllegalFormatCodePointException;

public class QuickSort9 extends PrintArray {

  public static void main(String[] args) {

//    int[] arr = {1, 3, 5, 26, 74, 36467,};

    int[] arr = new int[5];
    int length = arr.length;
    QuickSort9 quickSort6 = new QuickSort9();
    arr = quickSort6.generateRandomData(5);
    System.out.println("original Array");
    quickSort6.printArray(arr);

    quickSort(arr, 0, length - 1);

    System.out.println("Sorted Array");
    quickSort6.printArray(arr);
  }

  static int partition(int[] arr, int lefIndex, int rightIndex) {

    int pivot = arr[lefIndex];

    while (lefIndex < rightIndex) {
      while (arr[lefIndex] < pivot) {
        lefIndex++;
      }
      while (arr[rightIndex] > pivot) {
        rightIndex--;
      }
      if (lefIndex < rightIndex) {
        int tempVal = arr[lefIndex];
        arr[lefIndex] = arr[rightIndex];
        arr[rightIndex] = tempVal;
        lefIndex++;
        rightIndex--;
      }

    }
    return lefIndex;

  }

  static void quickSort(int[] arr, int lowIndex, int highIndex) {
    if (lowIndex < highIndex) {
      int pivotIndex = partition(arr, lowIndex, highIndex);
      if (lowIndex < pivotIndex - 1) {
        quickSort(arr, lowIndex, pivotIndex - 1);
      }
      if (highIndex < pivotIndex) {
        quickSort(arr, pivotIndex, highIndex);
      }
    }
  }
}
