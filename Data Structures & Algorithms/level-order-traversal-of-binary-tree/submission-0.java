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
    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> ans = new ArrayList<>();
       if(root==null) return ans;
       TreeNode cur = root;
       Deque<TreeNode> dq = new ArrayDeque<>();
       dq.add(cur);
       while(!dq.isEmpty()){
          int size = dq.size();
          List<Integer> ls = new ArrayList<>();
          for(int i=0;i<size;i++){
            TreeNode t = dq.poll();
            ls.add(t.val);
            if(t.left!=null) dq.offer(t.left);
            if(t.right!=null) dq.offer(t.right);
          }
          ans.add(ls);
       }
    return ans;
    }
}
