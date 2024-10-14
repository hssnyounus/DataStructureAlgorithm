package oops.arrays.algorithms.bubbleSort;

public class BubbleSort1 {

  public static void main(String[] args) {
    int[] arr = {3, 4, 1, 2, 7, 5, 6};
    int length = arr.length;
    BubbleSort1 bubbleSort1 = new BubbleSort1();

    System.out.println("original array");

    bubbleSort1.printArray(arr);

    bubbleSort1.bubbleSort(arr, length);

    System.out.println("sorted array");

    bubbleSort1.printArray(arr);

  }

  public void bubbleSort(int[] arr, int length) {

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

  public void printArray(int[] arr) {
    for (int el : arr) {
      System.out.println(el);
    }
  }
}
