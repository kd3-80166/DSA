

public class SinglyLL {
	public class Node{
		private int data;
		private Node next;
		
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public SinglyLL() {
		head = null;
		tail=null;
	}
	
	public boolean isEmpty() {
		return head == null && tail==null;
	}
	
	public void addFirst(int value) {
		//1. create node with given value
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty()) {
			//a. add newnode into head itself
			head =tail=newnode;
			
		//3. if list is not empty
			}
		else {
			//a. add first node into next of newnode
			newnode.next = head;
			//b. add newnode into head
			head = newnode;
		}
	}
	
	public void addLast(int value) {
		//1. create node with given data
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty())
			//a. add newnode into head itself
		{	head=tail = newnode;
			
		}
		//3. if list is not empty
		else {
//			//a. traverse till last node
//			Node trav = head;
//			while(trav.next != null)
//				trav = trav.next;
//			//b. add newnode into next of last node(trav.next)
			tail.next = newnode;
			tail=newnode;
			
		}
	}
	
	public void addPosition(int value, int pos) {
		//1. create node with given data
		Node newnode = new Node(value);
		//2. if list is empty
		if(isEmpty())
			//a. add newnode into head itself
			head =tail= newnode;
		// specail 1 : if pos <= 1
		else if (pos <= 1)
			addFirst(value);
		//3. if list is not empty
		
		else {
			//a. traverse till pos-1 node
			Node trav = head;
			// special 2: pos > N+1
			for(int i = 1 ; i < pos-1 && trav.next != null ; i++)
				trav = trav.next;
			//b. add pos node into next of newnode
			newnode.next = trav.next;
			//c. add newnode into next of pos-1 node
			if(trav.next==null)
				tail=newnode;
			
			trav.next = newnode;
			
		}
	}
	
	public void deleteFirst() {
		//1. if list is empty
		if(isEmpty())
			// print msg
			System.out.println("List is empty");
		//2. if list is not empty
		else
			//a. move head on second node
			head = head.next;
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(isEmpty())
			// print msg
			System.out.println("List is empty");
		//2. if list has single node
		else if(head.next == null)
			// make head equal to null
			head=tail = null;
		//2. if list has multiple nodes
		else {
			//a. traverse till second last node
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			//b. make next of second last node equal to null
			tail=trav;
			tail.next = null;
			
		}
	}
	
	public void deletePosition(int pos) {
		//1. if list is empty
		if(isEmpty())
			// print msg
			System.out.println("List is empty");
		// special 1: pos <= 1
		else if(pos <= 1)
			deleteFirst();
		// special 3: if list is having single node
		else if (head.next == null)
			head = null;
		//2. if list is not empty
		else {
			//a. traverse till pos -1 node
			Node trav = head;
			// special 2: pos > N
			for(int i = 1 ; i < pos - 1 && trav.next.next != null; i++)
				trav = trav.next;
			//b. add pos+1 node into next of pos-1 node
			trav.next = trav.next.next;
			if(trav.next.next==null)
				tail=trav;
			
		}
	}
	
	public void displayList() {
		//1. create one referance and start at first node
		Node trav = head;
		System.out.print("List :");
		while(trav != null) {
			//2. print(visit) the current node
			System.out.print("  " + trav.data);
			//3. go on next node
			trav = trav.next;
		}//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
	
	public void deleteAll() {
		head =tail= null;
	}
	
}







