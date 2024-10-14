package oops.arrays.algorithms.heapSort;

import oops.arrays.algorithms.PrintArray;

public class HeapSort6 extends PrintArray {

  public static void main(String[] args) {
    int size = 15;
    int[] arr;
    int length;

    HeapSort6 heapSort6 = new HeapSort6();

    arr = heapSort6.generateRandomData(size);
    length = arr.length;
    System.out.println("original array");
    heapSort6.printArray(arr);

    heapBuild(arr, length);
    heapSort(arr, length);
    System.out.println("sorted array");
    heapSort6.printArray(arr);
  }

  static void heapBuild(int[] arr, int length) {

    for (int index = length / 2 - 1; index >= 0; index--) {

      heapify(arr, length, index);

    }
  }

  static void heapify(int[] arr, int length, int index) {

    int largeIndex = index;
    int leftIndex = 2 * index + 1;
    int rightIndex = 2 * index + 2;
    if (leftIndex < length && arr[leftIndex] > arr[largeIndex]) {
      largeIndex = leftIndex;
    }
    if (rightIndex < length && arr[rightIndex] > arr[largeIndex]) {
      largeIndex = rightIndex;
    }
    if (largeIndex != index) {
      int tempVal = arr[index];
      arr[index] = arr[largeIndex];
      arr[largeIndex] = tempVal;
      heapify(arr, length, largeIndex);
    }
  }

  static void heapSort(int[] arr, int length) {
    for (int index = length - 1; index >= 0; index--) {
      int tempVal = arr[0];
      arr[0] = arr[index];
      arr[index] = tempVal;
      heapify(arr, index, 0);
    }
  }
}
