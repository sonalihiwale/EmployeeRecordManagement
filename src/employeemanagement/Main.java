
package employeemanagement;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeManagement management = new EmployeeManagement();

        int choice;

        do {
            System.out.println("\n===== Employee Record Management =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    Employee employee =
                            new Employee(id, name, department, salary);

                    management.addEmployee(employee);
                    break;

                case 2:
                    management.viewAllEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID to search: ");
                    id = sc.nextInt();

                    management.searchEmployee(id);
                    break;

                case 4:
                    System.out.print("Enter Employee ID to update: ");
                    id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter New Department: ");
                    department = sc.nextLine();

                    System.out.print("Enter New Salary: ");
                    salary = sc.nextDouble();

                    management.updateEmployee(
                            id, name, department, salary);
                    break;

                case 5:
                    System.out.print("Enter Employee ID to delete: ");
                    id = sc.nextInt();

                    management.deleteEmployee(id);
                    break;

                case 6:
                    System.out.println("Thank you for using the system!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}
