package com.sunbeam;

	public class QueueUsingStack7 {
		private Stack s1;
		private Stack s2;
		
		public QueueUsingStack7(int size) {
			s1 = new Stack(size);
			s2 = new Stack(size);
		}
		
		public void push(int data) {
			if(s1.isFull())
				System.out.println("Queue is Full");
			else {
				while(!s1.isEmpty()) {
					s2.push(s1.peek());
					s1.pop();
				}
				
				s1.push(data);
				
				while(!s2.isEmpty()) {
					s1.push(s2.peek());
					s2.pop();
				}	
			}
		}
		
		public void pop() {
			if(s1.isEmpty())
				System.out.println("Queue is Empty");
			else	
				s1.pop();
			
		}
		
		public int peek() {
			if(s1.isEmpty())
				System.out.println("Queue is Empty");
			else	
				return s1.peek();
			return -1;
		}
	}
	
	
	

