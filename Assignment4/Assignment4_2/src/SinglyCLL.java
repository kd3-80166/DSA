

public class SinglyCLL {
//	2. Implement singly circular linked list using tail pointer (no head pointer).
	//Compare time complexities of all operations.


	public class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	private Node tail;
	//private int count;
		
	public SinglyCLL() {
		tail=null;
	}
	
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		
		if(isEmpty()) 
		{
			newnode.next=newnode;
			tail=newnode;
		//	count++;
			return;
		}else
		{
			newnode.next=tail.next;
			tail.next=newnode;
			
		}
		//count++;
	}
	
	public void addLast(int value) {
		//1. create node with given data
		Node newnode = new Node(value);
		
		if(isEmpty()) 
		{
			newnode.next=newnode;
			tail=newnode;
		//	count++;
		}else//advantage of tail to add last only in singly list
		{
			newnode.next=tail.next;
			tail.next=newnode;
			tail=newnode;
		}
		//count++
	}
	public void addPosition(int value, int pos) {
		//1. create node with given data
		Node newnode = new Node(value);			
		if(isEmpty()) 
		{
			newnode.next=newnode;
			tail=newnode;
		}
		else if(pos<=1)
		{
			newnode.next=tail.next;
			tail.next=newnode;
			//count++;
			return;
			//addFirst(value);
		}
		else 
		{
			   Node trav=tail.next;//trav at first node  
			   for(int i=1; i< pos-1 && trav != tail; i++) 
				   trav=trav.next;
	
			   newnode.next=trav.next;//establish link first 			   
			   trav.next=newnode;
			   
			   if(trav==tail)//if trav at last node
				   tail=newnode; 	  
		}
	}
	
	void deleteFirst() {
		if(isEmpty()) {
			System.out.println("List is Empty To delete first");
			return;
		}
		else {
			tail.next=tail.next.next;
		}
	}
	
	void deleteLast() {
		if(isEmpty()) {
			System.out.println("List is Empty To delete last");
			return;
		}
		else {
			Node trav=tail.next;
			while(trav.next !=tail)
				trav=trav.next;
			
			trav.next=tail.next;
			tail=trav;
		}
	}
	
	void deletePosition(int pos) {
		if(isEmpty()) {
			System.out.println("List is Empty To delete pos");
			return;
		}
		else if(pos<=1)
		{
			tail.next=tail.next.next;	
		}
		// special 3: if list is having single node
		else if (tail.next == tail)
			tail=null;		
		else
		{
			Node trav=tail.next;
			for(int i=1; i< pos-1 && trav.next != tail; i++) 
				   trav=trav.next;
			
			if(trav.next == tail)
				tail=trav;
			
			trav.next=trav.next.next;	
		}
	}
	
	void display() {
	    if (isEmpty()) {
	        System.out.println("The list is empty to display");
	        return;
	    }
	    Node current = tail.next;
	    do {
	        System.out.print("   " + current.data);
	        current = current.next;
	    } while (current != tail.next);
	}

    boolean isEmpty() {
		return tail==null;
    	
    }
	
	

}
