package oops.arrays.algorithms.bubbleSort;

import oops.arrays.algorithms.PrintArray;

public class BubbleSort3 extends PrintArray {

  public static void main(String[] args) {
    int[] arr = {3, 4, 1, 2, 7, 5, 6};
    int length = arr.length;
    BubbleSort3 bubbleSort1 = new BubbleSort3();

    System.out.println("original Array");
    bubbleSort1.printArray(arr);

    bubbleSort(arr, length);

    System.out.println("Sorted Array");
    bubbleSort1.printArray(arr);

  }

  public static void bubbleSort(int[] arr, int length) {

    for (int leftIndex = 0; leftIndex < length; leftIndex++) {
      for (int rightIndex = 0; rightIndex < length - leftIndex - 1; rightIndex++) {
        if (arr[rightIndex] > arr[rightIndex + 1]) {
          int tempVal = arr[rightIndex];
          arr[rightIndex] = arr[rightIndex + 1];
          arr[rightIndex + 1] = tempVal;
        }
      }
    }

  }


}
