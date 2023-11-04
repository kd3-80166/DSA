
public class EmployeeLinkedList {
    private EmployeeNode head;

    private class EmployeeNode {
        Employee employee;
        EmployeeNode next;

        EmployeeNode(Employee employee) {
            this.employee = employee;
            this.next = null;
        }
    }
    
    public void addEmployee(Employee employee) {
        EmployeeNode newEmployeeNode = new EmployeeNode(employee);
        if (head == null) {
            head = newEmployeeNode;
        } else {
            EmployeeNode trav = head;
            while (trav.next != null) {
                trav = trav.next;
            }
            trav.next = newEmployeeNode;
        }
    }

    public void displayEmployees() {
        EmployeeNode trav = head;
        if (trav == null) {
            System.out.println("No employees in the list.");
        } else {
            System.out.println("Employee List:");
            while (trav != null) {
                System.out.println("Emp ID: " + trav.employee.getEmpId() + ", Name: " + trav.employee.getEmpName() + ", Salary: " + trav.employee.getEmpSalary());
                trav = trav.next;
            }
        }
    }

    public Employee searchEmployeeByName(String empName) {
        EmployeeNode trav = head;
        while (trav != null) {
            if (trav.employee.getEmpName().equals(empName)) {
                return trav.employee;
            }
            trav = trav.next;
        }
        return null;
    }

    public boolean deleteEmployeeByEmpId(int empId) {
        if (head == null) {
            return false;
        }

        if (head.employee.getEmpId() == empId) {
            head = head.next;
            return true;
        }

        EmployeeNode trav = head;
        EmployeeNode prev = null;
        while (trav != null) {
            if (trav.employee.getEmpId() == empId) {
                prev.next = trav.next;
                return true;
            }
            prev = trav;
            trav = trav.next;
        }
        return false;
    }

    public boolean updateSalary(int empId, double newSalary) {
        EmployeeNode trav = head;
        while (trav != null) {
            if (trav.employee.getEmpId() == empId) {
                trav.employee.setEmpSalary(newSalary);
                return true;
            }
            trav = trav.next;
        }
        return false;
    }

}
