
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BSTree {

	public class Node {
		private int data;
		private Node left;
		private Node right;

		public Node(int data) {
			this.setData(data);
			this.left = null;
			this.right = null;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
	}

	public Node root;

	public BSTree() {
		this.root = null;
	}

	boolean isEmpty() {
		return root == null;
	}

	public void addNode(int value) {
		Node nn = new Node(value);

		if (isEmpty())
			root = nn;
		else// if tree is not empty
		{
			Node trav = root;
			while (true) {
				if (value < trav.getData()) {
					if (trav.left == null) {
						trav.left = nn;
						break;
					} else
						trav = trav.left;
				} else // 3.3 if value is greater than current node data

				{
					if (trav.right == null) {
						trav.right = nn;
						break;
					} else
						trav = trav.right;
				}
			} // while

		}
	}// addnode

	private Node recAddNode(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}

		if (value < current.getData()) {
			current.left = recAddNode(current.left, value);
		} else if (value > current.getData()) {
			current.right = recAddNode(current.right, value);
		}
		return current;
	}

	public void recAddNode(int value) {
		root = recAddNode(root, value);
	}

	public void preOrder(Node trav) {
		// stop if trav is null
		if (trav == null)
			return;
		// visit current node (print data)
		System.out.print(" " + trav.getData());
		// go into left of current node
		preOrder(trav.left);
		// go into right of current node
		preOrder(trav.right);
	}

	public void inOrder(Node trav) {
		// stop if trav is null
		if (trav == null)
			return;
		// go into left of current node
		preOrder(trav.left);
		// visit current node (print data)
		System.out.print(" " + trav.getData());
		// go into right of current node
		preOrder(trav.right);

	}

	public void postOrder(Node trav) {
		// stop if trav is null
		if (trav == null)
			return;
		// go into left of current node
		preOrder(trav.left);
		// go into right of current node
		preOrder(trav.right);
		// visit current node (print data)
		System.out.print(" " + trav.getData());

	}

	void preOrder() {
		System.out.print("PreOrder : ");
		preOrder(root);
		System.out.println("");
	}

	void postOrder() {
		System.out.print("PostOrder : ");
		postOrder(root);
		System.out.println("");
	}

	void inOrder() {
		System.out.print("InOrder : ");
		inOrder(root);
		System.out.println("");
	}

	public void DFStraversal() {
		Stack<Node> st = new Stack<>();
		System.out.print("\nDFS Stack : ");
		// 1. push root on stack
		st.push(root);

		while (!st.isEmpty()) // while stack is not empty
		{
			Node trav = st.pop();

			System.out.print("   " + trav.getData());

			if (trav.right != null)
				st.push(trav.right);

			if (trav.left != null)
				st.push(trav.left);

		}
	}// DFSTraversal

	public void BFSTraversal() {
		Queue<Node> q = new LinkedList<>();

		q.offer(root);
		System.out.print("\nBFS Q : ");

		while (!q.isEmpty()) {
			Node trav = q.poll();
			System.out.print("   " + trav.getData());

			if (trav.left != null)
				q.offer(trav.left);

			if (trav.right != null)
				q.offer(trav.right);
		}
	}

	public boolean BSTSearch(int key) {
		Node trav = root;

		while (trav != null)
		{
			if (key == trav.getData())
				return true;

			if (key < trav.getData())
				trav = trav.left;
			else
				trav = trav.right;
		}
		return false;
	}

	public Node[] BSTSearchWithParent(int key) {
		Node parent = null;
		Node trav = root;

		while (trav != null) {
			if (key == trav.data)
				break;

			parent = trav; // move parent

			if (key < trav.data)
				trav = trav.left;
			else // if(key>trav.data)
				trav = trav.right;
		}
		if (trav == null)// i.e. root is null
			parent = null;

		return new Node[] { trav, parent };
	}

	public void deleteNode(int key) {
		Node childParent[] = BSTSearchWithParent(key);

		Node temp = childParent[0];// node to be deleted
		Node parent = childParent[1];// parent of node to be deleted

		if (temp == null)// no node found in the tree
			return;

		if(temp.left!=null && temp.right!=null) {
			
			Node trav=temp.left;
			parent=temp;
			
			while(trav.right!=null)//go to extreme right to find inorder predecessor
				trav=trav.right;
			
			temp.data=trav.data;// update data by data of predecessor
			temp=trav;////3. mark trav to be deleted
		}
		
		//Node with single child(right)
		if (temp.left == null)		
		{
			if (temp == root)
				root = temp.right;

			else if (parent.left == temp)
				parent.left = temp.right;

			else if (parent.right == temp)
				parent.right = temp.right;
		}

		else if (temp.right == null) {
			if (temp == root)
				root = temp.left;

			else if (parent.left == temp)
				parent.left = temp.left;

			else if (parent.right == temp)
				parent.right = temp.left;
		}

	}
	public int height(Node trav) {
		//0. if left or right sub tree is absent 
		if(trav == null)
				//then return 0
			return 0;
		//1. find height of left subtree
		int hl = height(trav.left);
		//2. find height of right subtree
		int hr = height(trav.right);
		//3. find max height
		int max = Integer.max(hl, hr);
		//4. add one into max height(return)
		return max + 1;
	}
	
	public int height() {
		return height(root);
	}
	

}
