
public class TestDQUsingDLL {

	public static void main(String[] args) {

		
		DequeUsingDLL dq=new DequeUsingDLL();
		dq.addRear(10);
		dq.addRear(20);
		dq.addRear(30);
		dq.addRear(40);
		System.out.println("Removed Element : "+dq.removeFront());
		System.out.println("Removed Element : "+dq.removeRear());

	}

}
