package in.vamsoft.ems;

import java.util.Map;

public class Employee {
  private static int employeeCounter=000;
  private String employeeId;
  private String employeeName;
  private double employeeSalary;
  

 public Employee()
 {
   
 }

  public Employee(String employeeName, double employeeSalary) {
    super();
    //change(emp);
    employeeCounter++;
    this.employeeId = "VAM"+employeeCounter;
    this.employeeName = employeeName;
    this.employeeSalary = employeeSalary;
    
  }
  public void change(Map<String,Employee> emp)
  {
    if (emp.containsKey(getEmployeeId())) {
      
    }
  }
  
  public double getEmployeeSalary() {
    return employeeSalary;
  }
  public void setEmployeeSalary(double employeeSalary) {
    this.employeeSalary = employeeSalary;
  }
  public String getEmployeeId() {
    return employeeId;
  }
 
  public String getEmployeeName() {
    return employeeName;
  }
  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }


  @Override
  public String toString() {
    return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
        + employeeSalary + "]";
  }
  
  
  
  

}
