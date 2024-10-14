package oops.strings;


public class StringExample {
  public static void main(String[] args) {
      StringExample.doString();
  }
  static public void  doString(){
    String emptyObj = new String("asas");
    int abc = emptyObj.length();
    System.out.println(abc);
    String s = "somethingaa";
    String newS = "something";
    if (s.equals(newS)){
      System.out.println("true");
    }else{
      System.out.println("false");
    }
  }
}
