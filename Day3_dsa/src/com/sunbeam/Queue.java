package com.sunbeam;

public class Queue {
		private final int SIZE;
		private int rear, front;
		private int arr[];
		int counter;
		
		
		public Queue(int size) {
			this.SIZE = size;
			rear = -1;
			front = -1;
			arr = new int[size];
			counter = 0;
		}
		
		public void push(int data) {
			if(isFull())
				System.out.println("Queue is Full");
			else {
				rear = (rear + 1) % SIZE;
				arr[rear] = data;
				counter++;
			}
		}
		public void pop() {
			if(isEmpty())
				System.out.println("Queue is Empty");
			else {
				front = (front + 1) % SIZE;
				if(front == rear) {
					front = -1;
					rear = -1;
				}
				counter--;
			}
		}
		
		public int peek() {
			if(isEmpty())
				System.out.println("Queue is Empty");
			else {
				return arr[(front + 1) % SIZE];
			}
			return -1;
		}
		
		public boolean isFull() {
			return counter == SIZE;
		}
		
		public boolean isEmpty() {
			return counter == 0;
		}
	}
	
