
public class TestSinglyLLSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLL list = new SinglyLL();

	    list.insertSorted(5);
	    list.insertSorted(2);
	    list.insertSorted(4);
	    System.out.println("Sorted Linked List ");
	    list.displayList(); // List : 5 2 4
	    
	    System.out.println("Maxium value from the list :"+list.findMax());
	    System.out.println("Minimum value from the list :"+list.findMin());

	}

}
