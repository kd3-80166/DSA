
public class QueueUsingSLL {
	
	SinglyLL list;
	int Size;
	int count;

public QueueUsingSLL(int size) {
	Size=size;
	count=0;
	list=new SinglyLL();
	
}


void push(int value) {
	list.addLast(value);
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
