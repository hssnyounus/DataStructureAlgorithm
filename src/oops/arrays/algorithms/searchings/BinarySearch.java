package oops.arrays.algorithms.searchings;

public class BinarySearch {

  public static void main(String[] args) {

    int[] arr = {2, 4, 3, 1, 5, 6, 7};
    int length = arr.length;

    BinarySearch binarySearch = new BinarySearch();
    binarySearch.binary(arr, length);

  }

  private void binary(int[] arr, int length) {
    int item = 3;
    int leftIndex = 0;
    int rightIndex = length - 1;


    int middle = (leftIndex + rightIndex) / 2;

    while (leftIndex < rightIndex) {
      if (arr[middle] == item) {
        System.out.println("item found it " + middle + " this position");
        break;
      } else if (arr[middle] < item) {
        leftIndex = middle + 1;
      } else {
        rightIndex = middle - 1;
      }
      middle = (leftIndex + rightIndex) / 2;
    }
    if (leftIndex > rightIndex) {
      System.out.println("not found");
    }
  }

}
