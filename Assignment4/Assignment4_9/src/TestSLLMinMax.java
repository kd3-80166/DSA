
public class TestSLLMinMax {

	public static void main(String[] args) {
		SinglyLL list = new SinglyLL();

	    list.addFirst(5);
	    list.addFirst(2);
	    list.addFirst(4);
	    list.displayList(); //List :  4  2  5
	    
	    System.out.println("Maxium value from the list :"+list.findMax());
	    System.out.println("Minimum value from the list :"+list.findMin());
	}

}
