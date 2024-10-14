package oops.company;

public class ProducerThread extends Thread {

  public final Company company;
  public ProducerThread(Company company1){

    this.company = company1;
  }
  @Override
  public void run() {
    int i = 1;

    while (true){
      this.company.produceItem(i);
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      i++;
    }
  }
}
