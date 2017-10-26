package in.vamsoft.oops.training;

import java.io.Serializable;

import com.bird.assignment.Bird;

import in.vamsoft.oops.training.bird.BirdTest;

public class Test implements Serializable{
	
	
	public Test(String s) {
		
	}

  public static void main(String[] args) {
	  SportsCar car = null;
	  Test t=null;
	  String str="new";
	  String str2=new String("new");
	  String str1="new";
	 
	//car.start();
	System.out.println(car instanceof SportsCar);
	System.out.println(t instanceof Test);
	System.out.println(str.hashCode()+" "+str1.hashCode()+" "+str2.hashCode());
	System.out.println(str.equals(str1));
	System.out.println(str==str2);
	  

  }

}
