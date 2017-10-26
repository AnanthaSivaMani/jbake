package in.vamsoft.ems;

import java.util.HashMap;
import java.util.Map;

public class EmployeeTest {

  public static void main(String[] args) {
    Map<String, Employee> eMap = new HashMap<>();
    eMap.put("vam", new Employee("siva", 2000.0));
   
  }

}
