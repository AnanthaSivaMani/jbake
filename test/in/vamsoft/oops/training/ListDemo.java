package in.vamsoft.oops.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

  public static void main(String[] args) {
  
    List<Employee> empList = new ArrayList<>();
    
    Employee e1 = new Employee(101,"A",60000);
    Employee e2 = new Employee(102,"B",70000);
    Employee e3 = new Employee(103,"C",80000);
    Employee e4 = new Employee(104,"D",90000);
    Employee e5 = new Employee(105,"E",40000);
    Employee e6 = new Employee(106,"F",30000);
    
    empList.add(e6);
    empList.add(e5);
    empList.add(e4);
    empList.add(e3);
    empList.add(e2);
    empList.add(e1);
    
    Collections.sort(empList);
    System.out.println(empList);
    
    
    

  }

}
