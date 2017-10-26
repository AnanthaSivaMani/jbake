package in.vamsoft.assignment;

public class PrintMonthNameUsingEnum {
	
	public enum Month { January, Febrauary, March, April, May, June, July, August, September, October, November, December } 


	public static void main(String[] args) {
//		for (Month s : Month.values())  
//			System.out.println(s+" "+s.values());  
//		
		System.out.println(Month.valueOf("May"));
	}

}
