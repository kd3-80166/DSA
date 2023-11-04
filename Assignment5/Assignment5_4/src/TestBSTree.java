
public class TestBSTree {

	public static void main(String[] args) {

		//BSTree bst = new BSTree();

		//		bst.addNode(8);
		//		bst.addNode(3);
		//		bst.addNode(10);
		//		bst.addNode(1);
		//		bst.addNode(6);
		//		bst.addNode(14);
		//		bst.addNode(4);
		//		bst.addNode(7);
		//		bst.addNode(13);
		//		

		//		bst.preOrder();
		//	    tree.inOrder();
		//	    tree.postOrder();

		//		bst.DFStraversal();
		//		bst.BFSTraversal();

		BSTree tree = new BSTree();
		int valuesToAdd[] = {50, 30, 70, 20, 40,35, 60, 80};

		for (int value : valuesToAdd) {
			tree.recAddNode(value);
		}
		
		tree.BFSTraversal();
		tree.DFStraversal();
		
        if(tree.BSTSearch(30)) 
        	System.out.println("\nKey found in the tree");
        else 
        	System.out.println("Key is not found");
			tree.preOrder();


        BSTree.Node parentChild[]=tree.BSTSearchWithParent(40);
        System.out.println("Child node data : "+parentChild[0].getData());
        System.out.println("Parent node data : "+parentChild[1].getData());

        tree.deleteNode(60);
		tree.preOrder();
		
		System.out.println(tree.height());

	}
	
		
	
}
