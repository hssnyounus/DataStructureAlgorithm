package oops.threads;

class MouseThread extends Thread {
  @Override
  public void run() {
    System.out.println("MouseThread");
  }
}
class KeyboardThread extends Thread {
  @Override
  public void run() {
    System.out.println("KeyboardThread");
  }
}

public class Computer {
  public static void main(String[] args) {
    Computer.mouse();
    Computer.keyboard();
  }
  public static void mouse(){
      MouseThread mouseThread = new MouseThread();
      mouseThread.start();
  }
 static public void keyboard(){
      KeyboardThread keyboardThread = new KeyboardThread();
      keyboardThread.start();
  }
}
