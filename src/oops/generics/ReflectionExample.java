package oops.generics;

class A {
  public void show(){

  }
}
public class ReflectionExample {
  public static void main(String[] args) {
    A a = new A();
    Class c = a.getClass();
    String s = c.getName();
    System.out.println(s);
  }
}
