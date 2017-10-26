package in.vamsoft.threadsynchronization;

public class Account {

  double balance;

  public Account(double balance) {
    this.balance = balance;
  }

  public double getBalance() {
    return balance;
  }

  public void withdraw(double amount) {
    if ((balance - amount) >= 0) {
      try {
        Thread.sleep(5000);
      } catch (InterruptedException e) {

        e.printStackTrace();
      }
      balance -= amount;
      System.out.println("Withdrwal by thread " + Thread.currentThread().getName() + " Successfulll. The balance is:" + getBalance());
    } else
      System.out.println("Insufficient balance for thread:" + Thread.currentThread().getName() + "Balance is:" + getBalance());
  }

}
