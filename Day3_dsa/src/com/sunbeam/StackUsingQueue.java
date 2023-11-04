package com.sunbeam;

public class StackUsingQueue {
	private Queue q1;
	private Queue q2;

	public StackUsingQueue(int size) {
		q1 = new Queue(5);
		q2 = new Queue(5);
	}

	public void push(int data) {
		if (q1.isFull())
			System.out.println("Stack is Full");
		else {
			q2.push(data);

			while (!q1.isEmpty()) {
				q2.push(q1.peek());
				q1.pop();
			}

			Queue q = q1;
			q1 = q2;
			q2 = q;
		}
	}

	public void pop() {
		if (q1.isEmpty())
			System.out.println("Stack is Empty");
		else
			q1.pop();
	}

	public int peek() {
		if (q1.isEmpty())
			System.out.println("Stack is Empty");
		else
			return q1.peek();
		return -1;
	}

}