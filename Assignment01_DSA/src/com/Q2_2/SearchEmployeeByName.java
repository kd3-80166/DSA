package com.Q2_2;
import java.lang.reflect.Array;
import java.util.Scanner;

public class SearchEmployeeByName {
	 public static void main(String[] args) {
	    Employee Arr [] = new Employee[4];
	    
	    Arr[0]= new Employee(1,"Shiva",50000);
	    Arr[1]= new Employee(2,"Arshad",60000);
	    Arr[2]= new Employee(3,"Akash",70000);
	    Arr[3]= new Employee(4,"Rahul",80000);

		Scanner Sc= new Scanner(System.in);
		System.out.print("Enter The Employee Name To Be Search : ");
		String name = Sc.next();
		
		for(int i=0;i<=Arr.length;i++) {
			
			if (Arr[i].getName().compareTo(name)== 0) {
				System.out.print("Employee Found : " + Arr[i].getId());
				System.out.print(" " + Arr[i].getName());
				System.out.print(" " + Arr[i].getSallary());
				break;
			}
		}
	
	}
}