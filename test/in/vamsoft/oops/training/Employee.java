package in.vamsoft.oops.training;

import in.vamsoft.oops.training.InValidSalaryException.SalaryEnum;

public class Employee implements Comparable<Employee> {

    private int employeeCode;
    private String employeeName;
    private double employeeSalary;

    public Employee(int employeeCode, String employeeName, double employeeSalary) {
        super();
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    public int getEmployeeCode() {
        return employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) throws InValidSalaryException {
        
        if(employeeSalary<25000)
            throw new InValidSalaryException("Salary should greater than 25000",SalaryEnum.Min_Level);
        else if(employeeSalary>3000000)
          throw new InValidSalaryException("Salary should less than 3000000",SalaryEnum.Max_Level);
        else
          this.employeeSalary = employeeSalary;
    }

    public void raiseSalary(double employeeSalary) {
        if (employeeSalary >= this.employeeSalary * 0.10) {
            this.employeeSalary = employeeSalary + this.employeeSalary;
        } else {
            System.out.println("Increment should be greater than 10% of the previous salary");
        }
    }

    @Override
    public int hashCode() {
        return employeeCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        if (employeeCode != other.employeeCode)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Employee [employeeCode=" + employeeCode + ", employeeName=" + employeeName + ", employeeSalary="
                + employeeSalary + "]\n";
    }

    @Override
    public int compareTo(Employee o) {
      if(this.employeeCode>o.employeeCode)
      return 1;
      else if(this.employeeCode<o.employeeCode)
        return -1;
      else
        return 0;
    }
  
    
    
}
