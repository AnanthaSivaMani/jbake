package in.vamsoft.oops.training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Dictionary {

  public static void main(String[] args) {
    
    Map<String,String> dictionary = new HashMap<>();
    dictionary.put("assume", "suppose");
    dictionary.put("breakthrough", "discovery");
    dictionary.put("deliver", "release");
    dictionary.put("detect", "track down");
    dictionary.put("pride", "honor");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    
   
      
      if(dictionary.containsKey(input))
      
        System.out.println(dictionary.get(input));
      else
        System.out.println("Word Not found");
    
    
  
    
    
    
   
  }

}
