
public class TestStackUsingSLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		StackUsingSLL stack=new StackUsingSLL(4);

		//if(stack.isFull())
		stack.push(10);
		stack.push(20);
		stack.push(40);


		stack.push(30);
		if(!stack.isFull())
			stack.push(50);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		
		
		
		


	}

}
