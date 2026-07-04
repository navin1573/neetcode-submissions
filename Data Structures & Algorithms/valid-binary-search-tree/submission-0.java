/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
public boolean isValidBST(TreeNode root) {
    if(root==null) return true;
    if(!leftLess(root.left,root.val)){
       return false; 
    }
    if(!rightGreater(root.right,root.val)){
        return false;
    }
    return isValidBST(root.left) && isValidBST(root.right);
}
boolean leftLess(TreeNode node,int val){
    if(node==null) return true;
    if(node.val>=val) return false;
    return leftLess(node.left,val) && leftLess(node.right,val);
}
boolean rightGreater(TreeNode node,int val){
    if(node==null) return true;
    if(node.val<=val) return false;
    return rightGreater(node.left,val) && rightGreater(node.right,val);
}

}