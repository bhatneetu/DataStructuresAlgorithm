package com.src.basic.datastructures.vmWareProblems;
/*
 * 
 * Mirror of a Tree: Mirror of a Binary Tree T is another Binary Tree M(T) with left and right children of all non-leaf nodes interchanged. 
 

MirrorTree1

Trees in the above figure are mirror of each other
 

Recommended: Please solve it on “PRACTICE” first, before moving on to the solution.
 

Method 1 (Recursive)




Algorithm – Mirror(tree): 
 

(1)  Call Mirror for left-subtree    i.e., Mirror(left-subtree)
(2)  Call Mirror for right-subtree  i.e., Mirror(right-subtree)
(3)  Swap left and right subtrees.
          temp = left-subtree
          left-subtree = right-subtree
          right-subtree = temp				
 * 
 * */
public class BinaryTreeMirror {

	public static void main(String[] args) {
		TreeNode root= new TreeNode(67);
		root.left = new TreeNode(57);
		root.left.left = new TreeNode(47);
		root.left.right = new TreeNode(60);
		root.right =new TreeNode(107);
		BTree tree=new BTree();
		tree.root=root;
		
		System.out.println("In-Order traversal of tree is...");
		tree.inOrder(root);
		System.out.println("\n\nTree after mirroring...");
		TreeNode rootNew=tree.mirror(tree.root);
		tree.inOrder(rootNew);
	}

}
