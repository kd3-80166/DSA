public class SinglyLL {

	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public SinglyLL() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		// 1. create node with given value
		Node newnode = new Node(value);
		// 2. if list is empty
		if (isEmpty())
			// a. add newnode into head itself
			head = newnode;
		// 3. if list is not empty
		else {
			// a. add first node into next of newnode
			newnode.next = head;
			// b. add newnode into head
			head = newnode;
		}
	}

	public void addLast(int value) {
		// 1. create node with given data
		Node newnode = new Node(value);
		// 2. if list is empty
		if (isEmpty())
			// a. add newnode into head itself
			head = newnode;
		// 3. if list is not empty
		else {
			// a. traverse till last node
			Node trav = head;
			while (trav.next != null)
				trav = trav.next;
			// b. add newnode into next of last node(trav.next)
			trav.next = newnode;
		}
	}

	public void addPosition(int value, int pos) {
		// 1. create node with given data
		Node newnode = new Node(value);
		// 2. if list is empty
		if (isEmpty())
			// a. add newnode into head itself
			head = newnode;
		// specail 1 : if pos <= 1
		else if (pos <= 1)
			addFirst(value);
		// 3. if list is not empty
		else {
			// a. traverse till pos-1 node
			Node trav = head;
			// special 2: pos > N+1
			for (int i = 1; i < pos - 1 && trav.next != null; i++)
				trav = trav.next;
			// b. add pos node into next of newnode
			newnode.next = trav.next;
			// c. add newnode into next of pos-1 node
			trav.next = newnode;
		}
	}

	public void deleteFirst() {
		// 1. if list is empty
		if (isEmpty())
			// print msg
			System.out.println("List is empty");
		// 2. if list is not empty
		else
			// a. move head on second node
			head = head.next;
	}

	public void deleteLast() {
		// 1. if list is empty
		if (isEmpty())
			// print msg
			System.out.println("List is empty");
		// 2. if list has single node
		else if (head.next == null)
			// make head equal to null
			head = null;
		// 2. if list has multiple nodes
		else {
			// a. taverse till second last node
			Node trav = head;
			while (trav.next.next != null)
				trav = trav.next;
			// b. make next of second last node equal to null
			trav.next = null;
		}
	}

	public void deletePosition(int pos) {
		// 1. if list is empty
		if (isEmpty())
			// print msg
			System.out.println("List is empty");
		// special 1: pos <= 1
		else if (pos <= 1)
			deleteFirst();
		// special 3: if list is having single node
		else if (head.next == null)
			head = null;
		// 2. if list is not empty
		else {
			// a. traverse till pos -1 node
			Node trav = head;
			// special 2: pos > N
			for (int i = 1; i < pos - 1 && trav.next.next != null; i++)
				trav = trav.next;
			// b. add pos+1 node into next of pos-1 node
			trav.next = trav.next.next;
		}
	}

	public void displayList() {
		Node trav = head;
		System.out.print("List forward display:");
		while (trav != null) {
			System.out.print(" "+trav.data);
			
			if (trav.next != null)
				System.out.print(" -> ");

			trav = trav.next;
		}
		System.out.println("");
	}

	public int length() {
		int length = 0;
		Node trav = head;
		while (trav != null) {
			length++;
			trav = trav.next;
		}
		return length;
	}

	public void deleteAll() {
		head = null;
	}

	public void displayListAsArrayInReverse() {
		int[] array = new int[length()]; // Create an array to store the elements
		Node trav = head;
		int index = 0;

		// Traverse the linked list and populate the array
		while (trav != null) {
			array[index] = trav.data;
			trav = trav.next;
			index++;
		}

		// Display the elements in the array in reverse order
		System.out.print("Reverse Linked List using Array: ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
			if (i > 0) {
				System.out.print(" -> ");
			}
		}
		System.out.println();
	}

}
