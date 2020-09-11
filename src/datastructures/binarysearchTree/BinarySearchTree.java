package datastructures.binarysearchTree;

public class BinarySearchTree {
	
	class Node{
		int key;
		Node left;
		Node right;
		
		Node(int key){
			this.key=key;
			left=right=null;
		}
	}
		Node root;
		
		public void insert(int key) {
			root=insertRec(root, key);
		}

		public Node insertRec(Node root, int key) {
			
			if(root==null) {
				Node n = new Node(key);
				root = n;
				return root;
			}
			if(key < root.key) {
				root.left=insertRec(root.left, key);
			}else if(key>root.key) {
				root.right=insertRec(root.right, key);
			}
			return root;
		}
		public void inOrder() {
			inOrderRec(root);
		}

		private void inOrderRec(Node root) {
			if(root!=null) {
				inOrderRec(root.left);
				System.out.print(root.key + " ");
				inOrderRec(root.right);
			}
		}
		public void preOrder() {
			preOrderRec(root);
		}

		private void preOrderRec(Node root) {
			if(root!=null) {
				System.out.print(root.key + " ");
				preOrderRec(root.left);
				preOrderRec(root.right);
			}
		}
		public void postOrder() {
			postOrderRec(root);
		}

		private void postOrderRec(Node root) {
			if(root!=null) {
				postOrderRec(root.left);
				postOrderRec(root.right);
				System.out.print(root.key + " ");
			}
		}
	  public void search(int key) {
		  root = searchRec(root, key);
		 if(root!=null) {
			 System.out.println(root.key +" is found");
		 }else {
			 System.out.println(key + " not found");
		 }
	  }

	private Node searchRec(Node root, int key) {
		if(root==null|| key==root.key) {
			return root;
		}else if(key<root.key) {
			return searchRec(root.left,key);
		}
		return	searchRec(root.right,key);
	}
	  

}
