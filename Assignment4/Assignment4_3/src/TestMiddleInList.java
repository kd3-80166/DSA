
/*3. Write a function to find middle node in a linked list.  
 */
public class TestMiddleInList {

	public static void main(String[] args) 
	{

		List linkedList=new List();
		linkedList.addFirst(10);
		linkedList.addFirst(20);
		linkedList.addFirst(30);
		linkedList.addFirst(40);
		linkedList.addFirst(50);

		System.out.println("Middle element in the list is : "+linkedList.findMiddle());
	}

}
