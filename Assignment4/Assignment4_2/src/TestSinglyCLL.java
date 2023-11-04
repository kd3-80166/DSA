
public class TestSinglyCLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyCLL list=new SinglyCLL();

		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);

		list.addLast(5);

		list.addPosition(100, 1);
		list.addPosition(120, 5);

		list.deleteFirst();
		list.deleteLast();
		list.deletePosition(1);

		list.display();

	}

}
