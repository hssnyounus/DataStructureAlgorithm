package oops.arrays.algorithms.mergSort;

public class MergSort3 {

  public static void main(String[] args) {

    int[] arr = {3, 1, 5, 6, 7, 4};
    int length = arr.length;

    dividArray(arr, new int[length], 0, length - 1);
    printArray(arr);

  }

  private static void dividArray(int[] arr, int[] tempArr, int lowIndex, int highIndex) {

    if (lowIndex < highIndex) {

      int middle = lowIndex + (highIndex - lowIndex) / 2;

      dividArray(arr, tempArr, lowIndex, middle);
      dividArray(arr, tempArr, middle + 1, highIndex);
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
    while (leftSort<= middleIndex){

      arr[allSort] = tempArr[leftSort];
      allSort++;
      leftSort++;

    }

  }


  private static void printArray(int[] arr) {

    for (int el : arr) {
      System.out.println(el + " ");
    }
  }
}
