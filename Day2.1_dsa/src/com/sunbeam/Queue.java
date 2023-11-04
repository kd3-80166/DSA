package com.sunbeam;

	public class Queue {
		int arr[];
		int front, rear;
		final int size;

		public Queue(int size) {
			this.size = size;
			arr = new int [size];
			front = rear = 0;
		}
		
		public void add(int data) {
			arr[rear] = data;
			rear=rear+1;
		}
		public void delete() {
			front++;
		}
		public int peek() {
			return arr[front];
		}

		public boolean isEmpty() {
			if(front == rear || rear == 0) return true;
			else return false;
		}
		
		public boolean isFull() {
			if(rear == size) return true;
			else return false;
		}
		
	}
	
	
	
	
	
	


