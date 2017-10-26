package in.vamsoft.threads;

public class MainThread {

  public static void main(String[] args) throws InterruptedException {
    
    System.out.println("Thread Started............");
    ThreadEx tr1 = new ThreadEx();
    Thread t1 = new Thread(tr1);
    t1.setPriority(3);
    t1.start();
   
    
    ThreadEx2 tr2 = new ThreadEx2();
    Thread t2 = new Thread(tr2);
    t2.setPriority(8);
    t2.start();
    
    t1.join();
    t2.join();
    System.out.println("Thread finished...");
  }

}
