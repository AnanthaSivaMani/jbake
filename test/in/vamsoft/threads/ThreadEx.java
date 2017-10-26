package in.vamsoft.threads;

public class ThreadEx implements Runnable {
  
  
  
  @Override
  public void run(){
  for(int i=1;i<=5;i++)
    System.out.println(Thread.currentThread().getName()+":"+i);
    try {
      Thread.sleep(100000000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
 

}
