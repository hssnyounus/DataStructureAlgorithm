package oops.arrays.algorithms.insertionSort;

public class insertionSort1 {

  public static void main(String[] args) {

    int[] arr = {3, 4, 1, 2, 7, 5, 6};
    int length = arr.length;

    System.out.println("original Array");
    printArray(arr);
    insertionSort(arr, length);

    System.out.println("Sorted Array");
    printArray(arr);
  }

  static void insertionSort(int[] arr, int length) {

    for (int nextIndex = 1; nextIndex < length; nextIndex++) {

      int tempVal = arr[nextIndex];
      int prevIndex = nextIndex;

      while (prevIndex > 0 && arr[prevIndex - 1] > tempVal) {

        arr[prevIndex] = arr[prevIndex - 1];
        prevIndex -= 1;

      }
      arr[prevIndex] = tempVal;
    }

  }

  static void printArray(int[] arr) {
    for (int el : arr) {
      System.out.println(el);
    }
  }
}

