
public class SinglyLinearLinkedListMain {

	public static void main(String[] args) {
		SinglyLL l1 = new SinglyLL();
		
		l1.addFirst(40);
		//40
		l1.addFirst(30);
		//30->40
		l1.addFirst(20);
		//20->30->40
		l1.addFirst(10);
		//10->20->30->40
		l1.addLast(50);
		//10->20->30->40->50
		//l1.deleteFirst();
		//20->30->40->50
		l1.deleteLast();
		//20->30->40
		l1.addPosition(60,6);
		//l1.deletePosition(6);
		l1.displayList();

		//l1.deleteAll();
	}

}
