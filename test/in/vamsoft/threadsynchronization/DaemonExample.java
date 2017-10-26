package in.vamsoft.threadsynchronization;




class UserThread1 extends Thread{
  @Override
  public void run() {
    System.out.println("user thread");
  }
  
  
  
}

public class DaemonExample extends Thread {
  
  
  @Override
  public void run() {
    
   for(int i=1;i<=50;i++)
     System.out.println("Daemon thread"+i);
      
    
    
  }

  public static void main(String[] args) {
    
    DaemonExample dExample = new DaemonExample();
    UserThread1 userThread1 = new UserThread1();
    
    dExample.setDaemon(true);
    dExample.start();
    userThread1.start();
   
  }

}
