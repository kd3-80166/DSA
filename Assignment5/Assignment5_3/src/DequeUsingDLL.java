
public class DequeUsingDLL {
	
	DLL list;

	public DequeUsingDLL() {
		this.list =new DLL();
		}
	 
	public void  addRear(int data) 
	{
		list.addLast(data);
	}
	
	public int  removeRear() 
	{
		return list.deleteLast();
	}
	public int  removeFront() 
	{
		return list.deleteFirst();
	}



}
