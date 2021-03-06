package in.vamsoft.ems;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class EmployeeManagementSystem {
Employee employee;
  Map<String, Employee> employeeMap = new HashMap<>();

  public boolean addEmployee(Employee employee) {
    employeeMap.put(employee.getEmployeeId(), employee);
    displayEmployeeDetails();
    return true;
  }

  public void editEmployee(String employeeId ) {
    Scanner scanner=new Scanner(System.in);
    if (employeeMap.containsKey(employeeId))
    {
      System.out.println("Enter the Employee Name");
      String empName=scanner.next();
      System.out.println("Enter the Employee Salary");
      double empSalary = scanner.nextDouble();
      //employee.change(employeeMap);
      Map.Entry<String, Employee> mapEn=(Entry<String, Employee>) employeeMap.entrySet();
      System.out.println(mapEn.getValue().getEmployeeId());
      employeeMap.put(employeeId,employee);
      scanner.close();
    }else {
      System.out.println("No Id found");
    }
    System.out.println(employeeMap);

  }

  public boolean removeEmployee(String employeeId) {
    if (employeeMap.containsKey(employeeId)) {
      employeeMap.remove(employeeId);
      return true;
    }

    else {
      System.out.println("Invalid Employee Id");
      return false;
    }
  }

  public void displayEmployeeDetails() {

    if (employeeMap.isEmpty())
      System.out.println("Empty....");
    else {
      for (Map.Entry<String, Employee> entry : employeeMap.entrySet()) {

        System.out.println("Employee Id    :" + entry.getValue().getEmployeeId());
        System.out.println("Employee Name  :" + entry.getValue().getEmployeeName());
        System.out.println("Employee Salary:" + entry.getValue().getEmployeeSalary());
       
      }
    }
  }

  public static void main(String[] args) {

    EmployeeManagementSystem ems = new EmployeeManagementSystem();
    String doContinue = "";
    System.out.println("Welcome to Employee Management System");
    System.out.println("--------------------------------------");
    do {
      System.out.println("1.Add Employee");
      System.out.println("2.Remove Employee");
      System.out.println("3.View Employee");
      System.out.println("4.Edit Employee");
      System.out.println("5.Exit");

      System.out.println("Please Enter your Option");
      Scanner scanner = new Scanner(System.in);

      int option = scanner.nextInt();

      switch (option) {
      case 1:
        System.out.println("Enter Employee Details");
        System.out.println("1.Enter Employee Name:");
        String empName=scanner.next();
        System.out.println("2.Enter Employee Salary:");
        double employeeSalary = scanner.nextDouble();
        Employee employee = new Employee(empName, employeeSalary);
        ems.addEmployee(employee);
        break;
      case 2:
        System.out.println("Enter the Employee ID you want to delete");
        String employeeId = scanner.next();
        ems.removeEmployee(employeeId);
        break;
      case 3:
        ems.displayEmployeeDetails();
        break;
      case 4:
        System.out.println("Enter the Employee ID you want to edit");
        String editEmployee = scanner.next();
        //System.out.println("Enter the new Employee name");
        /*String editName = scanner.next();
        System.out.println("Enter the new Employee Salary");
        double editSalary = scanner.nextDouble();
        Employee editEmployee1 = new Employee(editName, editSalary);
        */
        ems.editEmployee(editEmployee);
        break;
      case 5:
        System.exit(0);
        break;
      default:
        System.out.println("Invalid Option");

      }
      System.out.println("Do you want to continue?(y/n)");
      doContinue = scanner.next();
    } while (doContinue.equalsIgnoreCase("y"));

  }

}
