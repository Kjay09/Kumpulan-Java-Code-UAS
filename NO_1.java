package NO_1;
public class NO_1 {
    public static void main(String[] args) {
        Duty01 Threads01 = new Duty01();
        Duty02 Threads02 = new Duty02();
    
        Thread threads1 = new Thread(Threads01);
        Thread threads2 = new Thread(Threads02);
    
        threads1.start();
        threads2.start();
    
    }
}
class Duty01 implements Runnable {
    public void run() {
      System.out.println("Threading is powerful\n");
    }
  }

  class Duty02 implements Runnable {
    public void run() {
      System.out.println("But we have to be careful\n");
    }
  }
