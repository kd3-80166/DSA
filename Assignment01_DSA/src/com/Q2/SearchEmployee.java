package com.Q2;
import java.lang.reflect.Array;
import java.util.Scanner;

public class SearchEmployee {

	public static void main(String[] args) {
    Employee Arr [] = new Employee[4];
    
    Arr[0]= new Employee(1,"Gundu pandit",50000);
    Arr[1]= new Employee(2,"Kalin Bhaiiya",60000);
    Arr[2]= new Employee(3,"Munna Bhaiiya",70000);
    Arr[3]= new Employee(4,"bina Tripathi",80000);

	Scanner Sc= new Scanner(System.in);
	System.out.print("Enter The Employee ID To Be Search : ");
	int Empid= Sc.nextInt();
	
	for(int i=0;i<=Arr.length;i++) {
		
		if (Arr[i].getId()== Empid) {
			
			System.out.print("Employee Found : " + Arr[i].getId());
			System.out.print(" " + Arr[i].getName());
			System.out.print(" " + Arr[i].getSallary());
			break;
		}
	}
			

	
	

}
}
