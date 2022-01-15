package com.src.basic.datastructures.vmWareProblems;
/*
 * 
 * 
 * Given a binary tree, find height of it. Height of empty tree is -1, height of tree with one node is 0 and height of below tree is 2. 
 

Example Tree

Recommended: Please solve it on “PRACTICE” first, before moving on to the solution.
Recursively calculate height of left and right subtrees of a node and assign height to the node as max of the heights of two children plus 1. See below pseudo code and program for details.
Algorithm: 

 maxDepth()
1. If tree is empty then return -1
2. Else
     (a) Get the max depth of left subtree recursively  i.e., 
          call maxDepth( tree->left-subtree)
     (a) Get the max depth of right subtree recursively  i.e., 
          call maxDepth( tree->right-subtree)
     (c) Get the max of max depths of left and right 
          subtrees and add 1 to it for the current node.
         max_depth = max(max dept of left subtree,  
                             max depth of right subtree) 
                             + 1
     (d) Return max_depth
See the below diagram for more clarity about execution of the recursive function maxDepth() for above example tree. 

            maxDepth('1') = max(maxDepth('2'), maxDepth('3')) + 1
                               = 1 + 1
                                  /    \
                                /         \
                              /             \
                            /                 \
                          /                     \
               maxDepth('2') = 1                maxDepth('3') = 0
= max(maxDepth('4'), maxDepth('5')) + 1
= 1 + 0   = 1         
                   /    \
                 /        \
               /            \
             /                \
           /                    \
 maxDepth('4') = 0     maxDepth('5') = 0
 * 
 * 
 * 
 * */
public class BinaryTreeDepth {

	public static void main(String[] args) {
		TreeNode root= new TreeNode(67);
		root.left = new TreeNode(57);
		root.left.left = new TreeNode(47);
		root.left.right = new TreeNode(60);
		root.right =new TreeNode(107);
		BTree tree=new BTree();
		tree.root=root;
		System.out.println("Height of BinaryTree..."+tree.height(tree.root));
		System.out.println("Diameter of BinaryTree..."+tree.diameter(tree.root));
		
		
		
		TreeNode root1= new TreeNode(67);
		root1.left = new TreeNode(57);
		root1.left.left = new TreeNode(47);
		root1.left.right = new TreeNode(60);
		root1.left.right.left = new TreeNode(58);
		root1.left.right.right = new TreeNode(61);
		root1.right =new TreeNode(107);
		root1.right.right =new TreeNode(130);
		root1.right.right.right =new TreeNode(151);
		root1.right.right.right.left =new TreeNode(141);
		root1.right.right.right.left.right =new TreeNode(143);
		root1.right.right.right.right =new TreeNode(161);
		BTree tree1=new BTree();
		tree1.root =root1;
		System.out.println("Height of BinaryTree1..."+tree1.height(tree1.root));
		System.out.println("Diameter of BinaryTree2..."+tree1.diameter(tree1.root));
	}

}
class BTree{
	
	TreeNode root;
	
	public int height(TreeNode root) {
		if(root==null) {
			return 0;
		}
		TreeNode lft = root.left;
		TreeNode right = root.right;
		
		return Math.max(height(lft), height(right))+1;
	}
	
	public TreeNode mirror(TreeNode root) {
		if(root==null) {
			return root;
		}
		TreeNode left = mirror(root.left);
		TreeNode right = mirror(root.right);
		
		root.left = right;
		root.right = left;
		
		return root;
		
	}
	
	public void inOrder(TreeNode root) {
		if(root==null) {
			//System.out.println("Root is null");
			return;
		}
		inOrder(root.left);
		System.out.print(" "+root.data);
		inOrder(root.right);
	}
	
	public int diameter(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int righHeight = height(root.right);
		
		int lDiameter = diameter(root.left);
		int rDiameter = diameter(root.right);
		return Math.max((leftHeight+ righHeight+1), Math.max(lDiameter, rDiameter));
				
	}
	
}
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int data){
		this.data = data;
	}
}