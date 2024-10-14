package oops;

class A{

}
class B extends A{

}
public class City {
  int ip;
  String country;
  String city;

  public A getAddress() {
    System.out.println(ip + "ip address");
    System.out.println(country + "country");
    System.out.println(city +  "city");
    return new A();
  }
}
