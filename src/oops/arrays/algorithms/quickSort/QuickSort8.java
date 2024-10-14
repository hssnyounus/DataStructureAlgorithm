package oops.arrays.algorithms.quickSort;

import oops.arrays.algorithms.PrintArray;

public class QuickSort8 extends PrintArray {

  public static void main(String[] args) {

//    int[] arr = {1, 3, 5, 26, 74, 36467,};

    int[] arr = new int[5];
    int length = arr.length;
    QuickSort8 quickSort6 = new QuickSort8();
    arr = quickSort6.generateRandomData(5);
    System.out.println("original Array");
    quickSort6.printArray(arr);

    quickSort(arr, 0, length - 1);

    System.out.println("Sorted Array");
    quickSort6.printArray(arr);
  }

  static int partition(int[] arr, int leftIndex, int rightIndex) {

    int pivot = arr[rightIndex];
    while (leftIndex < rightIndex) {
      while (arr[leftIndex] < pivot) {
        leftIndex++;
      }
      while (arr[rightIndex] > pivot) {
        rightIndex--;
      }
      if (leftIndex < rightIndex) {
        int tempVal = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = tempVal;
        leftIndex++;
        rightIndex--;
      }
    }
    return leftIndex;
  }

  static void quickSort(int[] arr, int lowIndex, int highIndex) {
    int pivotIndex = partition(arr, lowIndex, highIndex);
    if (lowIndex < pivotIndex - 1) {
      quickSort(arr, lowIndex, pivotIndex - 1);
    }
    if (highIndex < pivotIndex) {
      quickSort(arr, pivotIndex, highIndex);
    }
  }
}
