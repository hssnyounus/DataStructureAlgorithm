package oops.arrays.algorithms.mergSort;

import oops.arrays.algorithms.PrintArray;

public class MergSort7 extends PrintArray {

  public static void main(String[] args) {

    int[] arr = {7, 3, 2, 1, 4, 5, 6};
    int length = arr.length;

    MergSort7 mergSort5 = new MergSort7();

    System.out.println("original array");
    mergSort5.printArray(arr);

    divideArray(arr, new int[length], 0, length - 1);

    System.out.println("sorted array");
    mergSort5.printArray(arr);

  }

  static void divideArray(int[] arr, int[] tempArr, int lowIndex, int highIndex) {
    if (lowIndex < highIndex) {
      int middle = lowIndex + (highIndex - lowIndex) / 2;

      divideArray(arr, tempArr, lowIndex, middle);
      divideArray(arr, tempArr, middle + 1, highIndex);
      mergeSort(arr, tempArr, lowIndex, middle, highIndex);
    }
  }

  static void mergeSort(int[] arr, int[] tempArr, int leftIndex, int middlIndex, int rightIndex) {
    for (int index = leftIndex; index <= rightIndex; index++) {
      tempArr[index] = arr[index];
    }
    int leftSort = leftIndex;
    int rightSort = middlIndex + 1;
    int allSort = leftIndex;
    while (leftSort <= middlIndex && rightSort <= rightIndex) {
      if (tempArr[leftSort] <= tempArr[rightSort]) {
        arr[allSort] = tempArr[leftSort];
        leftSort++;
      } else {
        arr[allSort] = tempArr[rightSort];
        rightSort++;
      }
      allSort++;
    }
    while (leftSort <= middlIndex) {
      arr[allSort] = tempArr[leftSort];
      allSort++;
      leftSort++;
    }
  }
}
