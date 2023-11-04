
/*3. Write a function to find middle node in a linked list. (Without using temporary List)
 *  
 */
public class TestReverseLL {

	public static void main(String[] args) 
	{

		List linkedList=new List();
		linkedList.addFirst(10);
		linkedList.addFirst(20);
		linkedList.addFirst(30);
		linkedList.addFirst(40);
		linkedList.addFirst(50);
		linkedList.reverseLinkedList();
		
		
		linkedList.displayList();
	}

}
