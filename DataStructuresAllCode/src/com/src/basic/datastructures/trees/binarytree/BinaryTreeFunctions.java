package com.src.basic.datastructures.trees.binarytree;

public class BinaryTreeFunctions {

	public static void main(String[] args) {
		BinaryTree bt= new BinaryTree();
		Node root=new Node(20);
		Node root1=new Node(20);
		
		Node left=new Node(12);
		Node right=new Node(28);
		Node rightLeft= new Node(22);
		Node rightLeftLeft= new Node(21);
		Node LeftLeft= new Node(10);
		Node LeftLeftLeft= new Node(9);
		Node n1=new Node(13);
		Node n2=new Node(3);
		
		
		root.left=left;
		root.right=right;
		bt.root=root;
		
		
		/*For testing mirror of tree*/
		Node left1=new Node(12);
		Node right1=new Node(28);
		 BinaryTree bt1= new BinaryTree();
		root1.left=right1;
		root1.right=left1;
		bt1.root=root1;
		
		
		
		/*For testing mirror of tree*/
		Node left2 =new Node(15);
		Node right2 =new Node(28);
		left2.left=new Node(14);
		left2.right=new Node(18);
		Node root2 =new Node(20);
		 BinaryTree bt2= new BinaryTree();
		root2.left= left2;
		root2.right= right2;
		bt2.root=root2;
		
		
		
		
		
		right.left= rightLeft;
		left.left=LeftLeft;
		left.right=rightLeftLeft;
		left.left.left=LeftLeftLeft;
		left.left.right=n1;
		//left.left.left.left=n2;
		
		//right.left.left=rightLeftLeft;
		
		
		System.out.println("Is the Btree balanced: "+bt.isTreeBalanced(root));
		System.out.println("Height is tree1 is :"+bt.height(root));
		System.out.println("Leaves of the tree is...");
		bt.leavesOfTree(bt.root);
		System.out.println("\n \nIn Order...  ");
		bt.inorderTraversal(bt.root);
		
		System.out.println("\n \nPre Order...  ");
		bt.preTraversal(bt.root);
		
		System.out.println("\n \nPost Order...  ");
		bt.postTraversal(bt.root);
		
		
		System.out.println("\n \nMirror of tree1 is...  ");
		bt1.mirror();
		bt1.inorderTraversal(bt1.root);
		
		
		
		System.out.println("\n \nMirror of tree 2 is...  ");
		bt2.mirror();
		bt2.inorderTraversal(bt2.root);
		//System.out.println("Height is tree2 is :"+bt1.height(root));
		//System.out.println("Is tree1 a mirror of treee 2??  "+bt.isMirror(bt.root,bt1.root));
	}

}


class Node{
	int data;
	Node right;
	Node left;
	
	public Node(int data) {
		
		this.data = data;
		this.left = this.right=null;
	}
	
	
}


/*
 * Traversal techniques
 * 1. In order--Done
 * 2. Post Order--Done
 * 3. Pre-order--Done
 * 4. Height of binary tree--Done
 * 5. Is a mirror.--Done
 * 6. print the mirror.--Done
 * 7. add--Done
 * 8. delete
 * 9. Is the tree balanced--Done
 * 10. Depth of Tree
 * 11. Leaves of tree--Done
 * 12. Check if one node is ancestral of another
 * 13. Length between 2 nodes
 * 14. Convert Binary to Binary Search Tree
 * 15. Balance the tree
 * */

class BinaryTree{
	Node root;
	
	
	/*A tree is said to be balanced when the difference between the left subtree and the right subtree is 
	 * n0t greater than1*/
	public boolean isTreeBalanced(Node root) {
		int leftHeight;
		int rightHeight;
		
		if(root==null) {
			return true;
		}
		leftHeight= height(root.left);
		rightHeight= height(root.right);
	
		
		if(isTreeBalanced(root.left) && isTreeBalanced(root.right)&&(leftHeight-rightHeight)<=1)
		{
			return true;
		}
		return false;
		
	}

	/* Height of a tree is =
	 *  maximum of 
	 * (height between the left and the right subtree )
	 * + the root tree
	 	*/
	public int height(Node root) {
		if(root==null) {
			return 0;
		}
		
		return 1+Math.max(height(root.left),height(root.right));
	}
	
	public boolean isMirror(Node tree1,Node tree2) {
		if(tree1==null && tree2==null) {
			return true;
		}
		if(tree1==null || tree2==null) {
			return false;
		}
		
		/*System.out.println(((tree1.data==tree2.data)
				+"   "+tree1.left.data+"   "+tree2.right.data+"   "+
				((tree1.left.data==tree2.right.data )
						+"   "+  (tree1.right.data==tree2.left.data))));*/
		if((tree1.data==tree2.data)
				&&
				((tree1.left.data==tree2.right.data )
						&& (tree1.right.data==tree2.left.data))) {
			return true;
		}
		return false;
		
	}
	/*
	 * A node can be printed as leaf if the left and right of node is null
	 * */
	public void leavesOfTree(Node root) {
		if(root==null) {
			System.out.println("Returning as root is null");
			return;
		}
		if(root.left==null && root.right==null) {
			
			System.out.print(" "+root.data+" ");
			return;
		}
		if(root.left!=null) {
			leavesOfTree(root.left);
		}
		if(root.right!=null) {
			leavesOfTree(root.right);
		}
		
		
	}
	
	public void inorderTraversal(Node root) {
		if(root==null) {
			return;
		}
		inorderTraversal(root.left);
		System.out.print(root.data+"-->");
		inorderTraversal(root.right);
	}
	
	public void postTraversal(Node root) {
		if(root==null) {
			return;
		}
		postTraversal(root.left);
		postTraversal(root.right);
		System.out.print(root.data+"-->");
	}
	
	public void preTraversal(Node root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+"-->");
		preTraversal(root.left);
		preTraversal(root.right);
		
	}
	
	void mirror() {
		root= mirror(root);
	}
	 
	Node mirror(Node node) {
		
		if(node==null) {
			return node;
		}
		Node left = mirror(node.left);
		Node right = mirror(node.right);
		
		node.left= right;
		node.right= left;
		
		return node;
	}
}