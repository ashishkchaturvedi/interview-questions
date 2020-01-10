package com.tree;

public class PathSum {

	public static void main(String[] args) {
		TreeNode  root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);
		int sum = 22;
		
		System.out.println(hasPathSum(root, sum));

	}
	
    public static boolean hasPathSum(TreeNode root, int sum) {
        
        if (root == null)
            return false;

	      sum -= root.key;
	      if ((root.left == null) && (root.right == null))
	        return (sum == 0);
	      return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }

}
