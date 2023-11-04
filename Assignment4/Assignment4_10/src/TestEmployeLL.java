

import java.util.Scanner;
public class TestEmployeLL {
	private static void addEmployee(Scanner scanner, EmployeeLinkedList employeeList) {
        System.out.print("Enter Employee ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        double empSalary = scanner.nextDouble();
        Employee employee = new Employee(empId, empName, empSalary);
        employeeList.addEmployee(employee);
        System.out.println("Employee added successfully.");
    }

    private static void displayEmployees(EmployeeLinkedList employeeList) {
        employeeList.displayEmployees();
    }

    private static void searchEmployeeByName(Scanner scanner, EmployeeLinkedList employeeList) {
        scanner.nextLine();
        System.out.print("Enter Employee Name to search: ");
        String searchName = scanner.nextLine();
        Employee foundEmployee = employeeList.searchEmployeeByName(searchName);
        if (foundEmployee != null) {
            System.out.println("Employee found - Emp ID: " + foundEmployee.getEmpId() + ", Name: " + foundEmployee.getEmpName() + ", Salary: " + foundEmployee.getEmpSalary());
        } else {
            System.out.println("Employee with name '" + searchName + "' not found.");
        }
    }

    private static void deleteEmployeeByEmpId(Scanner scanner, EmployeeLinkedList employeeList) {
        System.out.print("Enter Employee ID to delete: ");
        int deleteId = scanner.nextInt();
        if (employeeList.deleteEmployeeByEmpId(deleteId)) {
            System.out.println("Employee with ID " + deleteId + " deleted.");
        } else {
            System.out.println("Employee with ID " + deleteId + " not found.");
        }
    }

    private static void updateSalary(Scanner scanner, EmployeeLinkedList employeeList) {
        System.out.print("Enter Employee ID to update salary: ");
        int updateId = scanner.nextInt();
        System.out.print("Enter new salary: ");
        double newSalary = scanner.nextDouble();
        if (employeeList.updateSalary(updateId, newSalary)) {
            System.out.println("Salary updated for Employee with ID " + updateId);
        } else {
            System.out.println("Employee with ID " + updateId + " not found.");
        }
    }

	public static void main(String[] args) {
		EmployeeLinkedList employeeList = new EmployeeLinkedList();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee by Name");
            System.out.println("4. Delete Employee by Emp ID");
            System.out.println("5. Update Employee Salary");
            System.out.println("6. Quit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(scanner, employeeList);
                    break;

                case 2:
                    displayEmployees(employeeList);
                    break;

                case 3:
                    searchEmployeeByName(scanner, employeeList);
                    break;

                case 4:
                    deleteEmployeeByEmpId(scanner, employeeList);
                    break;

                case 5:
                    updateSalary(scanner, employeeList);
                    break;

                case 6:
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
	}
}

