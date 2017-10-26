package in.vamsoft.oops.training;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



class SalaryComparator implements Comparator<Employee>{

  @Override
  public int compare(Employee o1, Employee o2) {
   
    if(o1.getEmployeeSalary()>o2.getEmployeeSalary())
      return -1;
    else if(o1.getEmployeeSalary()<o2.getEmployeeSalary())
      return 1;
    else
      return 0;
  
  }
  
  
  
  
}





public class SetDemo {

  public static void main(String[] args) {
   
    Set<Employee> employeeSet  = new TreeSet<>();
    
    Employee e1 = new Employee(101,"A",60000);
    Employee e2 = new Employee(102,"B",70000);
    Employee e3 = new Employee(103,"C",80000);
    Employee e4 = new Employee(104,"D",90000);
    Employee e5 = new Employee(105,"E",40000);
    Employee e6 = new Employee(106,"F",30000);
    
    employeeSet.add(e1);
    employeeSet.add(e2);
    employeeSet.add(e3);
    employeeSet.add(e4);
    employeeSet.add(e5);
    employeeSet.add(e6);
    
    System.out.println("Sorting based on id");
    System.out.println("-------------------");
    System.out.println(employeeSet);
    
    Set<Employee> employeeSetSalary  = new TreeSet<>(new SalaryComparator());
    
    employeeSetSalary.addAll(employeeSet);
    
    System.out.println();
    System.out.println("-------------------");
    System.out.println(employeeSetSalary);
    
    
    Set<Integer> intSet = new TreeSet<>();
    intSet.add(100);
    intSet.add(84);
    intSet.add(1000);
    intSet.add(35);
    intSet.add(52);
    System.out.println(intSet);
    

  }

}
