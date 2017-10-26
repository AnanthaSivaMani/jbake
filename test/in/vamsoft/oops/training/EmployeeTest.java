package in.vamsoft.oops.training;

import static java.lang.Math.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import in.vamsoft.oops.training.InValidSalaryException.SalaryEnum;

public class EmployeeTest {
  
    
    
 

    public static void main(String[] args) {
    
        Employee siva = new Employee(105, "siva",20000);
        try {
            siva.setEmployeeSalary(4000000);
        } catch (InValidSalaryException e) {
          if(e.errorCode==SalaryEnum.Min_Level) {
           
           System.out.println(e.getMessage());
          }
          else if(e.errorCode==SalaryEnum.Max_Level) {
            
            System.out.println(e.getMessage());
           }
        }
     
        List<Integer> cl = new ArrayList<>();
        cl.add(100);
        cl.add(200);
      
       
        cl.add(500);
        cl.add(200);
        cl.add(600);
        cl.add(900);
        cl.add(500);
        List<Integer> sl  = cl.subList(2, 5);
        System.out.println(cl.contains(100)+" "+cl.size());
        
        System.out.println(cl);
        System.out.println(sl);
       
       int j=(int) ((ArrayList) cl).get(0);
       System.out.println(j);
        
        
      System.out.println(siva);
    }

}
