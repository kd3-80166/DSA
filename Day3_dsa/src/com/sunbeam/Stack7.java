package com.sunbeam;


	public class Stack7 {
		private int arr[];
		private int size;
		private int top;

		public void Stack(int size) {
			this.size = size;
			arr = new int[size];
			top = -1;
		}

		public boolean isFull() {
			return top == size - 1;
		}

		public boolean isEmpty() {
			return top == -1;
		}

		public void push(int data) {
			if (isFull())
				System.out.println();
			else {
				top++;
				arr[top] = data;
			}
		}

		public void pop() {
			if (isEmpty())
				System.out.println();
			else
				top--;
		}
		
		public int peek() {
			if(isEmpty())
				return -1;
			else
				return arr[top];
		}
	}
	

