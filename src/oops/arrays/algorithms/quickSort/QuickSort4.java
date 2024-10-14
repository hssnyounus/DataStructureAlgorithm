package oops.arrays.algorithms.quickSort;

public class QuickSort4 {

  public static void main(String[] args) {

    int[] arr = {7, 3, 1, 5, 2, 6};
    int length = arr.length;

    printArray(arr);

    System.out.println("Original Array");

    quickSort(arr, 0, length - 1);

    System.out.println("Sorted Array");
    printArray(arr);
  }

  static void quickSort(int[] arr, int lowIndex, int highIndex) {

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

  static int partition(int[] arr, int leftIndex, int rightIndex) {

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

  private static void printArray(int[] arr) {

    for (int el : arr) {
      System.out.println(el + " :");
    }

  }

}
