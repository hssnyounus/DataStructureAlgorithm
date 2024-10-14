package oops.threads;

public class ThreadDownload {

  public static void main(String[] args) {
    MyThread t1 = new MyThread();
    Thread thread = new Thread(t1);
    thread.start();
  }

  private static class MyThread implements Runnable{

    @Override
    public void run() {
      for (int i =0; i<100; i++){
        System.out.println("thread working");
        try {
          Thread.sleep(5000);
        }catch (Exception e){
          System.out.println(e.getMessage());
        }
      }

    }
  }

}
