package in.vamsoft.threads;

public class ThreadEx2 implements Runnable {

  @Override
  public void run() {
    int sum=0;
   for(int i=1;i<=100;i++)
     sum+=i;
   System.out.println(sum+" "+Thread.currentThread().getName());
    
  }

}
