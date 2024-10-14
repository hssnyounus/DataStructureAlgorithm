package oops.exceptionHandling;

public class ExceptionHandling  extends Exception{
  public static void main(String[] args) {
    System.out.println("starting...");
    int a = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);
    long c = a/b;
    System.out.println(c);
    System.out.println("ending...");
  }
}
