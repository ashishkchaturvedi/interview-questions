package com.tree;

//class TreeNode{
//	int key;
//	TreeNode left;
//	TreeNode right;
//	
//	public TreeNode(int k){
//		this.key = k;
//		this.left = null;
//		this.right = null;
//	}
//}


public class SymmetricTree {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		
		System.out.println(isSymmetric(root));

	}
	
    public static boolean isSymmetric(TreeNode root) {
    	return isMirror(root, root);
    }
    
    public static boolean isMirror(TreeNode t1, TreeNode t2){
        
       	if(t1 == null && t2 == null) return true;
       	
       	if(t1 == null || t2 == null) return false;
       	
       	return (t1.key == t2.key) && 
       				isMirror(t1.left, t2.right) &&
       				isMirror(t1.right, t2.left);
       	
    }

}
