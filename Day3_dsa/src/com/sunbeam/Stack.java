package com.sunbeam;

public class Stack {
		private int arr[];
		private int size;
		private int top = -1;

		public Stack(int size) {
			this.size = size;
			arr = new int[size];
		}

		public void push(int data) {
			if (isFull()) {
				System.out.println("Stack is full");
			} else {
				top++;
				arr[top] = data;
			}
		}

		public int pop() {
			if (isEmpty())
				System.out.println("Stack is Empty");
			else {
				int data = arr[top];
				top--;
				return data;
			}
			return -1;
		}

		public int peek() {
			if (isEmpty())
				System.out.println("Stack is empty");
			else
				return arr[top];
			return -1;
		}

		public boolean isFull() {
			return top == size - 1;
		}

		public boolean isEmpty() {
			return top == -1;
		}
	}
	
	
	
	

