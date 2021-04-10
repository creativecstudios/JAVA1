//https://leetcode.com/problems/symmetric-tree/

class SymmetricTree {

Example 1:
Input: root = [1,2,2,3,4,4,3]
Output: true

Example 2:
Input: root = [1,2,2,null,3,null,3]
Output: false
	
	public static boolean isSymmetric(TreeNode root) {
		isMirror(root,root);
	}
	public static isMirror(TreeNode root1, TreeNode root2) {
		if(root1 == null && root2 == null){
			return true;
		}
		if(root1 == null || root2 == null) {
			retutn false;
		}
		return root1.val == root2.val && isMirror(root1.left,root2.right) && isMirrot(root1.right,root2.left);
	}

}