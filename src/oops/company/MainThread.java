package oops.company;

public class MainThread {
  public static void main(String[] args) {
    Company company = new Company();
    ProducerThread producerThread = new ProducerThread(company);
    ConsumerThread consumerThread = new ConsumerThread(company);
    producerThread.start();
    consumerThread.start();

  }
}
