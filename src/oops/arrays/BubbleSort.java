package oops.arrays;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    BubbleSort bubbleSort = new BubbleSort();
//    bubbleSort.doBubbleSort();
//    bubbleSort.doBubbleSort1();
//    bubbleSort.bubbleSort6();
    bubbleSort.bubbleSort8();
  }

  public void doBubbleSort() {
    int[] bubbles = {38, 52, 9, 18, 12, 24, 36};
    int temp;

    for (int firstIndex = 0; firstIndex < bubbles.length - 1; firstIndex++) {
      boolean swaped = false;
      for (int secondIndex = 0; secondIndex < bubbles.length - firstIndex - 1; secondIndex++) {
        if (bubbles[secondIndex] > bubbles[secondIndex + 1]) {

          temp = bubbles[secondIndex];
          bubbles[secondIndex] = bubbles[secondIndex + 1];
          bubbles[secondIndex + 1] = temp;
          swaped = true;
        }
      }
      if (!swaped) {
        break;
      }
      for (int swap = 0; swap < bubbles.length; swap++) {
        System.out.println(bubbles[swap]);
      }
      Arrays.stream(bubbles).forEach(el -> System.out.println("using stream " + el));
    }

  }

  public void doBubbleSort1() {

    int[] bubbles = {38, 52, 9, 18, 1, 12, 3, 24, 36, 2, 4, 7};
    for (int index = 0; index < bubbles.length; index++) {
      boolean swaped = false;
      for (int secondIndex = 0; secondIndex < bubbles.length - index - 1; secondIndex++) {

        if (bubbles[secondIndex] > bubbles[secondIndex + 1]) {
          int temp = bubbles[secondIndex];
          bubbles[secondIndex] = bubbles[secondIndex + 1];
          bubbles[secondIndex + 1] = temp;
          swaped = true;
        }

      }
      if (!swaped) {
        break;
      }
      for (int el : bubbles) {
        System.out.println("el: " + el);
      }
    }
  }

  public static void bubbleSort2() {
    int[] bubbles = {5, 4, 1, 2, 3};

    for (int index = 0; index < bubbles.length; index++) {
      boolean swaped = false;
      for (int secondIndex = 0; secondIndex < bubbles.length - index - 1; secondIndex++) {
        if (bubbles[secondIndex] > bubbles[secondIndex + 1]) {
          int temp = bubbles[secondIndex];
          bubbles[secondIndex] = bubbles[secondIndex + 1];
          bubbles[secondIndex + 1] = temp;
          swaped = true;
        }
      }
      if (!swaped) {
        break;
      }
    }
  }

  public static void bubbleSort3() {
    int[] bubbles = {5, 4, 1, 2, 3};

    for (int leftIndex = 0; leftIndex < bubbles.length; leftIndex++) {
      boolean swapped = false;
      for (int rightIndex = 0; rightIndex < bubbles.length - leftIndex - 1; rightIndex++) {

        if (bubbles[rightIndex] > bubbles[rightIndex + 1]) {
          int temp = bubbles[rightIndex];
          bubbles[rightIndex] = bubbles[rightIndex + 1];
          bubbles[rightIndex + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }

  public static void bubbleSort4() {
    int[] bubbles = {5, 4, 1, 2, 3};
    for (int leftIndex = 0; leftIndex < bubbles.length; leftIndex++) {
      boolean swapped = false;
      for (int rightIndex = 0; rightIndex < bubbles.length - leftIndex - 1; rightIndex++) {

        if (bubbles[rightIndex] > bubbles[rightIndex + 1]) {

          int temp = bubbles[rightIndex];
          bubbles[rightIndex] = bubbles[rightIndex + 1];
          bubbles[rightIndex + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }

  public static void bubbleSort5() {
    int[] bubbles = {5, 4, 1, 2, 3};
    int length = bubbles.length;
    boolean swapped = false;
    for (int leftIndex = 0; leftIndex < length; leftIndex++) {

      for (int rightIndex = 0; rightIndex < length - leftIndex - 1; rightIndex++) {

        if (bubbles[rightIndex] > bubbles[rightIndex + 1]) {

          int temp = bubbles[rightIndex];
          bubbles[rightIndex] = bubbles[rightIndex + 1];
          bubbles[rightIndex + 1] = temp;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }

  public static void bubbleSort6() {
    int[] bubbles = new int[]{1, 2, 3, 4};
    int length = bubbles.length;
    int tempValue;
    boolean swapped = false;

    for (int leftIndex = 0; leftIndex < length; leftIndex++) {

      for (int rightIndex = 0; rightIndex < length - leftIndex - 1; rightIndex++) {

        if (bubbles[rightIndex] > bubbles[rightIndex + 1]) {

          tempValue = bubbles[rightIndex];
          bubbles[rightIndex] = bubbles[rightIndex + 1];
          bubbles[rightIndex + 1] = tempValue;
          swapped = true;
        }

      }
      if (!swapped) {
        break;
      }
    }
  }

  public static void bubbleSort7() {

    int[] bubbles = new int[]{5, 3, 1, 2, 4};
    int length = bubbles.length;
    int tempVal;
    boolean swapped = false;

    for (int leftIndex = 0; leftIndex < length; leftIndex++) {

      for (int rightIndex = 0; rightIndex < length - leftIndex - 1; rightIndex++) {

        if (bubbles[rightIndex] > bubbles[rightIndex + 1]) {

          tempVal = bubbles[rightIndex];
          bubbles[rightIndex] = bubbles[rightIndex + 1];
          bubbles[rightIndex + 1] = tempVal;
          swapped = true;
        }
      }
      if (!swapped) {
        break;
      }
    }
  }


  public static void bubbleSort8() {

    int[] bubbles = {3, 5, 6, 2, 1};
    int n = bubbles.length;
    int tempVal;
    for (int leftIndex = 0; leftIndex < n; leftIndex++) {

      for (int rightIndex = 0; rightIndex < n - leftIndex - 1; rightIndex++) {

        if (bubbles[rightIndex] > bubbles[rightIndex + 1]) {

          tempVal = bubbles[rightIndex];
          bubbles[rightIndex] = bubbles[rightIndex + 1];
          bubbles[rightIndex + 1] = tempVal;

        }
      }
    }
    Arrays.stream(bubbles).forEach(el -> System.out.println(el));
  }


}
