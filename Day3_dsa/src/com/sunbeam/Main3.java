package com.sunbeam;

import java.util.Scanner;

public class Main3 {

	static int menu(Scanner scan) {
		int choice;

		System.out.println("0. Exit");
		System.out.println("1. Add data");
		System.out.println("2. Delete Stack data");
		System.out.println("3. Peek Stack data");
		System.out.print("Enter your choice : ");
		choice = scan.nextInt();

		return choice;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		StackUsingQueue stk = new StackUsingQueue(5);

		while ((choice = menu(scan)) != 0) {
			switch (choice) {
			case 1:// add data
				System.out.print("--> Enter data : ");
				int data = scan.nextInt();
				stk.push(data);
				System.out.println();
				break;
			case 2:// delete data
				stk.pop();
				System.out.println();
				break;
			case 3:// peeked data
				int data1 = stk.peek();
				System.out.println("--> Peeked data : " + data1);
				System.out.println();
				break;
			default:
				System.out.println("Invalid choice...Try again!!");
				System.out.println();
				break;
			}
		}

	}

}