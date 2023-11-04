
public class StackUsingSLL {
	
	SinglyLL list;
	int Size;
	int count;

	public StackUsingSLL(int size) {
		Size=size;
		list=new SinglyLL();
		
	}
	
	void push(int value) {
		list.addFirst(value);
		count++;
		}
	
	int pop() {
		count--;
		return list.deleteFirst();
	}
	
	int peek() {			
		return list.getData();	
	}
	
	boolean isEmpty() {
		return list.isEmpty();
		}
	
	boolean isFull() 
	{
		return count==Size;
	}

	
}
