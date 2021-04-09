//https://leetcode.com/problems/same-tree/

class IsSameTree {
    
// Example 1:
// Input: p = [1,2,3], q = [1,2,3]
// Output: true
    
// Example 2:
// Input: p = [1,2], q = [1,null,2]
// Output: false
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        else if(p== null ||  q == null){
            return false;
        }
        else if(p.val != q.val){
            return false;
        }
        else{
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }
}
