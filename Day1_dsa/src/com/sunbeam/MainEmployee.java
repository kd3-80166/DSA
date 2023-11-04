package com.sunbeam;

public class MainEmployee {
    public static Employee searchByEmpid(Employee[] employees, int empid) {
        for (Employee employee : employees) {
            if (employee != null && employee.getEmpid() == empid) {
                return employee;
            }
        }
        return null;
    }

    public static Employee searchByName(Employee[] employees, String name) {
        for (Employee employee : employees) {
            if (employee != null && employee.getName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    public static Employee searchBySalary(Employee[] employees, double salary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() == salary) {
                return employee;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(101, "Alice", 50000.0);
        employees[1] = new Employee(102, "Bob", 60000.0);
        employees[2] = new Employee(103, "Charlie", 75000.0);
        employees[3] = new Employee(104, "David", 60000.0);
        employees[4] = new Employee(105, "Eve", 55000.0);

        int searchEmpid = 103;
        String searchName = "David";
        double searchSalary = 60000.0;

        Employee foundByEmpid = searchByEmpid(employees, searchEmpid);
        Employee foundByName = searchByName(employees, searchName);
        Employee foundBySalary = searchBySalary(employees, searchSalary);

        if (foundByEmpid != null) {
            System.out.println("Employee found by empid: " + foundByEmpid.getName());
        } else {
            System.out.println("Employee not found by empid");
        }

        if (foundByName != null) {
            System.out.println("Employee found by name: " + foundByName.getEmpid());
        } else {
            System.out.println("Employee not found by name");
        }

        if (foundBySalary != null) {
            System.out.println("Employee found by salary: " + foundBySalary.getName());
        } else {
            System.out.println("Employee not found by salary");
        }
    }
}