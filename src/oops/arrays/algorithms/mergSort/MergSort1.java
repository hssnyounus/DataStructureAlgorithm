package oops.arrays.algorithms.mergSort;

public class MergSort1 {
  public static void main(String[] args) {
    int[] arr = {5, 3, 2, 7, 1, 6};
    int length = arr.length;
    int[] tempArr = new int[length];
    System.out.println("Original Array:");
    printArray(arr);

    sort(arr, new int[length], 0, length - 1);

    System.out.println("Sorted Array:");
    printArray(arr);
  }

  static void sort(int[] arr, int[] tempArr, int lowIndex, int highIndex) {

    if (lowIndex < highIndex) {

      int middle = lowIndex + (highIndex - lowIndex) / 2;

      sort(arr, tempArr, lowIndex, middle);
      sort(arr, tempArr, middle + 1, highIndex);
      mergSort(arr, tempArr, lowIndex, middle, highIndex);
    }

  }

  static void mergSort(int[] arr, int[] tempArr, int leftIndex, int middleIndex, int rightIndex) {

    for (int index = leftIndex; index <= rightIndex; index++) {
      tempArr[index] = arr[index];
    }

    int leftSort = leftIndex;
    int rightSort = middleIndex + 1;
    int allSort = leftIndex;

    while (leftSort <= middleIndex && rightSort <= rightIndex) {

      if (tempArr[leftSort] <= tempArr[rightSort]) {

        arr[allSort] = tempArr[leftSort];
        leftSort++;

      } else {

        arr[allSort] = tempArr[rightSort];
        rightSort++;

      }

      allSort++;
    }

    while (leftSort <= middleIndex) {

      arr[allSort] = tempArr[leftSort];
      allSort++;
      leftSort++;

    }
  }


  private static void printArray(int[] arr) {
    for (int el : arr) {
      System.out.println(el + " ");
    }
    System.out.println();
  }
}
