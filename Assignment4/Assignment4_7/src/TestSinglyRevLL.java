
public class TestSinglyRevLL {
	
	
	public static void main(String[] args) {
		SinglyLL list = new SinglyLL();

	    list.addLast(5);
	    list.addLast(2);
	    list.addLast(4);

	    list.displayList(); //List forward display: 5 ->  2 ->  4
	    
	    list.displayListAsArrayInReverse();//Reverse Linked List using Array: 4 -> 2 -> 5
      
	    
	}
	
}
