
public class DCLL {
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value)
		{
			data=value;
			next=null;
			prev=null;
		}
	}
	private Node head;
	 
	public DCLL() {
		head=null;
	}

	public boolean isEmpty()
	{
		return head==null;
	}	
	
	public void addFirst(int value)
	{
		Node nn=new Node(value);
		
		if(isEmpty()) 
		{
			head=nn;
			head.next=nn;
			head.prev=nn;
		}
		else 
		{
		     nn.next=head;
		     nn.prev=head.prev;
		     head.prev.next=nn;
		     head.prev=nn;

		    
		     head=nn;
		}
	}
	
	public void addLast(int value)
	{
		Node nn=new Node(value);
		
		if(isEmpty()) 
		{
			head=nn;
			head.next=nn;
			head.prev=nn;
		}
		else 
		{
		     nn.next=head;

		     nn.prev=head.prev;
		     
		     head.prev.next=nn;
		     head.prev=nn;
		    		     
		}
	}
	
	
	void addPos(int value,int pos) 
	{
		
		Node nn=new Node(value);
		
		if(isEmpty()) 
		{
			head=nn;
			head.next=nn;
			head.prev=nn;
		}
		else if(pos<=1)
			addFirst(value);
		else 
			{
				Node trav=head;
			
				for(int i=1; i< pos && trav !=head;i++) 
					trav=trav.next;
			
				nn.prev=trav.prev;
				nn.next=trav;
				
				trav.prev.next=nn;
				trav.prev=nn;
			}
		
			

	}	
	
	void delFirst()
	{
		if(isEmpty())
			return;
		
		if(head.next==head) //if list has only one node
		{
			head=null;
		}
		else {
				head.prev.next=head.next;
				head.next.prev=head.prev;
				head=head.next;
		}
		
	}
	
	void delLast()
	{
		if(isEmpty())
			return;
		
		if(head.next==head) //if list has only one node
		{
			head=null;
		}
		else {
				head.prev.prev.next=head;
				head.prev=head.prev.prev;
			}
		
	}
	
	void delPos(int pos) {
		if(isEmpty()) 
		{
			System.out.println("List is Empty");
			return;
		}
		else if(head.next==head) {
			head=null;
		}
		else if(pos<=1) {
			delFirst();
		}
		else {
			
			Node trav=head;
			
			for (int i=1; i < pos && trav.next != head ;i++)
				trav=trav.next;
			
			trav.next.prev=trav.prev;
			trav.prev.next=trav.next;

		}
			
	}
	
	
	public void display() {
		if(isEmpty())
			return;
		Node trav=head;
		System.out.print("List : ");
		
		do {
			System.out.print("   "+trav.data);
			trav=trav.next;
		}while(trav !=head);
		System.out.println("");
	}
	
}
