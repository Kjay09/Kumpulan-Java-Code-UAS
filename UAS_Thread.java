public class UAS_Thread {
    public static void main(String[] args) {
        Duty01 threads01 = new Duty01();
        Duty02 threads02 = new Duty02();
        Thread Threads1 = new Thread(threads01);
        Thread Threads2 = new Thread(threads02);
        Threads1.start();
        Threads2.start();
    }
    class Duty01 implements Runnable {
        @Override
        public void run() {
          System.out.println("Threading is powerful\n");
        }
      }
      class Duty02 implements Runnable {
        @Override
        public void run() {
          System.out.println("But we have to be careful\n");
        }
      }
}

