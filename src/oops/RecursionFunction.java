package oops;

public class RecursionFunction {
  public static void main(String[] args) {

    int s = sum(3);
    System.out.println(s);
  }

  public static int sum(int n) {
    if (n > 0) {
      return n + sum(n - 1);
    }
    return 0;
  }
}
