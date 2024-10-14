package oops.arrays.algorithms.quickSort;

public class QuickSort2 {

  public static void main(String[] args) {

    int[] arr = {3, 1, 5, 6, 7, 4};
    int length = arr.length;


    quickSort(arr, 0, length - 1);

    printArr(arr);
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

    int pivotIndex = arr[leftIndex];

    while (leftIndex<=rightIndex){
      while (arr[leftIndex]< pivotIndex){
        leftIndex++;
      }
      while (arr[rightIndex] > pivotIndex){
        rightIndex--;
      }
      if (leftIndex<= rightIndex){
        int tempVal = arr[leftIndex];
        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = tempVal;
        leftIndex++;
        rightIndex--;
      }
    }

    return leftIndex;
  }
  static void printArr(int[] arr){
    for (int el:arr){
      System.out.println("sorted array:" +el);
    }
  }
}
