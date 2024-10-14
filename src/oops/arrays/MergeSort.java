package oops.arrays;

public class MergeSort {

  //  main vars
//  int[] arrays;
//  int[] tempMergeArr;
//  int length;

  public static void main(String[] args) {
    int[] arrays = {5, 6, 4, 2, 1, 8, 9, 12, 3,};
    int length = arrays.length;
    MergeSort mergeSort = new MergeSort();

    mergeSort.sort(arrays, new int[arrays.length], 0, length- 1);
    for (int el:         arrays) {
      System.out.println(el);
    }
  }

  public void sort(int[] arr, int[] tempMergeArr, int lowerIndex, int higherIndex) {
    if (lowerIndex < higherIndex) {
      int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
      sort(arr, tempMergeArr, lowerIndex, middle);
      sort(arr, tempMergeArr, middle + 1, higherIndex);
      merge(arr, tempMergeArr, lowerIndex, middle, higherIndex);
    }
  }
//  public void sort(int[] inputArr) {
//
//    this.arrays = inputArr;
//    this.length = inputArr.length;
//    this.tempMergeArr = new int[length];
//    devidArray(0, length-1);
//
//  }
//
//  public void devidArray(int lowerIndex, int higherIndex) {
//    if (lowerIndex < higherIndex) {
//      int middle = lowerIndex + (lowerIndex - higherIndex) / 2;
//      devidArray(lowerIndex, middle);
//      devidArray(middle + 1, higherIndex);
//      mergeArray(lowerIndex, middle, higherIndex);
//    }
//  }

  private void merge(int[] arr, int[] tempMergeArr, int lowerIndex, int middle, int higherIndex) {
    for (int index = lowerIndex; index <= higherIndex; index++) {
      tempMergeArr[index] = arr[index];
    }
    int leftSort = lowerIndex;
    int rightSort = middle + 1;
    int fullSort = lowerIndex;
    while (leftSort <= middle && rightSort <= higherIndex) {

      if (tempMergeArr[leftSort] <= tempMergeArr[rightSort]) {

        arr[fullSort] = tempMergeArr[leftSort];
        leftSort++;

      } else {

        arr[fullSort] = tempMergeArr[rightSort];
        rightSort++;

      }
      fullSort++;

    }

    while (leftSort <= middle) {
      arr[fullSort] = tempMergeArr[leftSort];
      fullSort++;
      leftSort++;
    }
  }


}
