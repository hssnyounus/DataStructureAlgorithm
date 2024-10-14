package oops.arrays;

public class ArrayUnderstanding {

  public static void main(String[] args) {

    int[] ints = {1,2,4,5};

    for (int i = 0; i<ints.length; i++){
      if (ints[i] == 4){
        System.out.println("three is comes up " + ints[i]);
      }else{
        System.out.println("out of three digit " + ints[i]);
      }
    }
  }
}
