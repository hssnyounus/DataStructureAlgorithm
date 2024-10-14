package oops.arrays.algorithms.insertionSort;

import oops.arrays.algorithms.PrintArray;

public class insertionSort6 extends PrintArray {

  public static void main(String[] args) {

    int[] arr = {3, 4, 1, 2, 7, 5, 6};
    int length = arr.length;
    insertionSort6 insertionSort2 = new insertionSort6();

    System.out.println("original Array");
    insertionSort2.printArray(arr);

    insertionSort(arr, length);

    System.out.println("Sorted Array");
    insertionSort2.printArray(arr);
  }


  static void insertionSort(int[] arr, int length) {

    int prevIndex, tempVal;
    for (int nextIndex = 1; nextIndex < length; nextIndex++) {
      tempVal = arr[nextIndex];
      prevIndex = nextIndex;
      while (prevIndex > 0 && arr[prevIndex - 1] > tempVal) {
        arr[prevIndex] = arr[prevIndex - 1];
        prevIndex -=1;
      }
      arr[prevIndex] = tempVal;
    }
  }
}

