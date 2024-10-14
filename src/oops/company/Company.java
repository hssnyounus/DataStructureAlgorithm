package oops.company;

public class Company {
  int anInt;
  synchronized public void produceItem(int n){
    this.anInt = n;
    System.out.println("produced Item"+this.anInt);
  }
  synchronized public void consumerItem(){

    System.out.println("produced Item"+this.anInt);
  }
}
