package in.vamsoft.oops.training;

import java.util.Scanner;

public class ArithException {
    
    
    
    
    public int add() {
        
        int numerator=0;
        int denominator=0;

        try {
            numerator = 50;
            denominator = 10;
            System.out.println(numerator / denominator);
            return numerator / denominator;
        } catch (ArithmeticException | NumberFormatException ae) {
            System.out.println(ae.getMessage());
          
        }
        System.out.println("check finally");
        return 5;
        
    }

    public static void main(String[] args) {
       
    }

}
