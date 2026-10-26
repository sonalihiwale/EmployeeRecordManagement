
package employeemanagement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class EmployeeManagement {

    private List<Employee> employeeList = new ArrayList<>();
    private Set<Integer> employeeIds = new HashSet<>();
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    // Add Employee
    public void addEmployee(Employee employee) {

        if (employeeIds.contains(employee.getId())) {
            System.out.println("Employee ID already exists!");
            return;
        }

        employeeList.add(employee);
        employeeIds.add(employee.getId());
        employeeMap.put(employee.getId(), employee);

        System.out.println("Employee added successfully!");
    }

    // View All Employees
    public void viewAllEmployees() {

        if (employeeList.isEmpty()) {
            System.out.println("No employee records found.");
            return;
        }

        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    // Search Employee
    public void searchEmployee(int id) {

        Employee employee = employeeMap.get(id);

        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found!");
        }
    }

    // Update Employee
    public void updateEmployee(int id, String name,
                               String department, double salary) {

        Employee employee = employeeMap.get(id);

        if (employee != null) {
            employee.setName(name);
            employee.setDepartment(department);
            employee.setSalary(salary);

            System.out.println("Employee updated successfully!");
        } else {
            System.out.println("Employee not found!");
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        Employee employee = employeeMap.remove(id);

        if (employee != null) {
            employeeList.remove(employee);
            employeeIds.remove(id);

            System.out.println("Employee deleted successfully!");
        } else {
            System.out.println("Employee not found!");
        }
    }
}
