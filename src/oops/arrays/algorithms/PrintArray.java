package oops.arrays.algorithms;


import java.util.Random;

public class PrintArray {

  public void printArray(int[] arr) {
    for (int el : arr) {
      System.out.println(el);
    }
  }
  public int[] generateRandomData(int size) {
    int[] data = new int[size];
    Random random = new Random();
    for (int index = 0; index < size; index++) {
      data[index] = random.nextInt(100);
    }
    return data;
  }
}
