package oops.arrays.algorithms.mergSort;

import oops.arrays.algorithms.PrintArray;

public class MergSort5 extends PrintArray {

  public static void main(String[] args) {

    int[] arr = {7, 3, 2, 1, 4, 5, 6};
    int length = arr.length;

    MergSort5 mergSort5 = new MergSort5();

    System.out.println("original array");
    mergSort5.printArray(arr);

    divideArray(arr, new int[length], 0, length - 1);

    System.out.println("sorted array");
    mergSort5.printArray(arr);

  }

  static void divideArray(int[] arr, int[] tempArr, int lowIndex, int highIndex) {
    int middle = lowIndex + (highIndex - lowIndex) / 2;

    if (lowIndex > highIndex) {
      divideArray(arr, tempArr, lowIndex, middle);
      divideArray(arr, tempArr, middle + 1, highIndex);
      mergeSort(arr, tempArr, lowIndex, middle, highIndex);
    }

  }

  static void mergeSort(int[] arr, int[] tempArr, int leftIndex, int middleIndex, int rightIndex) {

    for (int index = 0; index < rightIndex; index++) {
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

}