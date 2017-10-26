package in.vamsoft.oops.training.bird;

import com.bird.assignment.Animal;
import com.bird.assignment.Bird;
import com.bird.assignment.Crow;
import com.bird.assignment.Talking;

/**
 * @author vamsoft
 *
 */
public class BirdTest {
	
	private int a;
	private String name;
	public  BirdTest() {
		int b=15;
		System.out.println(a+" "+name+" "+b);
	}

//	public void test() {
//		int a;
//		String name;
//		System.out.println(a+" "+name);
//	}
	
  public static void main(String[] args) {
	  BirdTest obj = new BirdTest();
	  System.out.println(obj.a);
	
	Bird b = new Crow();
	Animal a1 = new Animal();
	Talking t1 = new Animal();
	new Crow().talk("Sings");

  }

}
