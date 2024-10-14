package oops;

public class User extends City{
  String userName;

  public void getUserDetails (){
    System.out.println(userName);
  }

  public B getAddress() {
    return  new B();
  }
}
