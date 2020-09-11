package datastructures.binarysearchTree;

public class BinarySearchTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarySearchTree tree = new BinarySearchTree();
	
		 /* Let us create following BST 
        50 
     /     \ 
    30      70 
   /  \    /  \ 
 20   40  60   80 */
  /*tree.insert(50); 
  tree.insert(30); 
  tree.insert(20); 
  tree.insert(40); 
  tree.insert(70); 
  tree.insert(60); 
  tree.insert(80);*/
			tree.insert(41);
		tree.insert(20);
		tree.insert(11);
		tree.insert(29);
		tree.insert(32);
		tree.insert(65);
		tree.insert(50);
		tree.insert(91);
		tree.insert(72);
		tree.insert(99);
		
		System.out.print("\ninorder: ");tree.inOrder();
		System.out.print("\npreorder: ");tree.preOrder();
		System.out.print("\npostorder: ");tree.postOrder();
		System.out.println();
		tree.search(72);
	}

}
