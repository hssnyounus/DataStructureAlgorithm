package oops.arrays.algorithms.heapSort;

public class HeapSort2 {
  public static void main(String[] args) {
    int[] arr = {3, 4, 1, 2, 7, 5, 6};
    int length = arr.length;

    System.out.println("original array");
    printArray(arr);

    heapBuild(arr, length);
    heapSort(arr,length);
    System.out.println("sorted array");
    printArray(arr);
  }

  static void heapBuild(int[] arr, int length) {
    for (int index = length / 2 - 1; index >= 0; index--) {
      heapify(arr, length, index);
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

  static void heapify(int[] arr, int length, int index) {

    int largIndex = index;
    int leftIndex = 2 * index + 1;
    int rightIndex = 2 * index + 2;

    if (leftIndex < length && arr[leftIndex] > arr[largIndex]) {
      largIndex = leftIndex;
    }

    if (rightIndex < length && arr[rightIndex] > arr[largIndex]) {
      largIndex = rightIndex;
    }

    if (largIndex != index) {

      int tempVal = arr[index];
      arr[index] = arr[largIndex];
      arr[largIndex] = tempVal;

      heapify(arr, length, largIndex);
    }

  }

  static void printArray(int[] arr) {
    for (int el : arr) {
      System.out.println(el + ":");
    }
  }
}
