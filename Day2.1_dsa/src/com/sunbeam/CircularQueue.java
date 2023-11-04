package com.sunbeam;

public class CircularQueue {
		int arr[];
		int front, rear;
		final int size;
		private int counter;

		public CircularQueue(int size) {
			this.size = size;
			arr = new int[size];
			front = rear = -1;
			counter = 0;
		}

		public void add(int data) {
			
			rear = (rear + 1) % size;
			arr[rear] = data;
			counter++;
		}

		public void delete() {
			front = (front + 1) % size;
			counter--;
		}

		public int peek() {
			return arr[(front + 1) % size];
		}

		public boolean isEmpty() {
			if (counter == 0)
				return true;
			else
				return false;
		}

		public boolean isFull() {
			if (counter == size)
				return true;
			else
				return false;
		}

	}
	
	
	
	
	
	


