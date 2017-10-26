package in.vamsoft.threadsynchronization;

public class BankingThread implements Runnable {

  Account a;
  double withdrawlAmt;

  @Override
  public void run() {
    System.out.println("Balance for: " + Thread.currentThread().getName() + " " + a.getBalance());
    synchronized (a) {
      a.withdraw(withdrawlAmt);
    }

  }
  
  public BankingThread(Account a,double withdrawlAmt) {
    this.a = a;
    this.withdrawlAmt = withdrawlAmt;
  }

  public static void main(String[] args) {
    
    Account account = new Account(1000);
    BankingThread b1 = new BankingThread(account, 500);
    BankingThread b2 = new BankingThread(account,750);
    Thread t1= new Thread(b1,"Thread1");
    Thread t2= new Thread(b2,"Thread2");
    t1.start();
    t2.start();
    
    

  }

}
