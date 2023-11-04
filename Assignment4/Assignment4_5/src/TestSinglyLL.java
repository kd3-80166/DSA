/* In singly linear list implement following operations.
	i. insert a new node after a given node
	ii. insert a new node before a given node*/
public class TestSinglyLL {

	public static void main(String[] args) {

		SinglyLL list = new SinglyLL();

		list.addLast(1);
		list.addLast(2);
		list.addLast(4);

		list.displayList(); // List : 1  2  4

		list.insertAfterNode(2, 8);
		list.displayList(); // List :  1  2  8  4

		list.insertBeforeNode(4, 16);

		list.displayList(); // List : 1  2  8  16  4



	}

}
