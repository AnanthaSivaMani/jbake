package in.vamsoft.threadsynchronization;

import java.util.Scanner;

class Messanger extends Thread{
  
  String message;
  MessageReciever reciever;
  
  
  public MessageReciever getReciever() {
    return reciever;
  }

  public void setReciever(MessageReciever reciever) {
    this.reciever = reciever;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
  
  public void run() {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Please enter you message");
    this.message=scanner.nextLine();
    synchronized (reciever) {
      reciever.notify();
    }
  }
}

class MessageReciever extends Thread{
  Messanger messanger;
  
  
  public Messanger getMessanger() {
    return messanger;
  }


  public void setMessanger(Messanger messanger) {
    this.messanger = messanger;
  }


  public void run() {
    synchronized (this) {
      try {
        wait();
      } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    System.out.println(messanger.getMessage());
    
  }
}



public class WaitNotifyDemo {
  public static void main(String[] args) {
    Messanger messanger=new Messanger();
    MessageReciever reciever=new MessageReciever();
    reciever.setMessanger(messanger);
    messanger.setReciever(reciever);
    messanger.start();
    reciever.start();
  }
}
