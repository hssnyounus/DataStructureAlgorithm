package oops.generics;

import java.util.function.Function;

public class FunctionExample {

  public static void main(String[] args) {
      FunctionExample.doFunction();
  }
  public static void doFunction(){
    Function<String,Integer> function =  x -> x.length();
    System.out.println(function.apply("something"));
  }
}
