
public class TestDCLL {
	
	public static void main(String[] args) {
		DCLL list=new DCLL();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addLast(30);
		list.addLast(40);
		list.addPos(50, 6);
//		list.delFirst();
//		list.delLast();
//		list.delLast();
		list.delPos(6);
		
		list.display();
	}
    
	
	
}
