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
    public int maxDepth(TreeNode root) {
        return maxDepthRecursion(root,1);
    }
    
    public int maxDepthRecursion(TreeNode root,int currLen){
        if(root==null)
        return 0;
        if(root.left==null && root.right==null)
            return currLen;
        currLen++;
        int len1=maxDepthRecursion(root.left,currLen);
        int len2=maxDepthRecursion(root.right,currLen);
        return Math.max(len1,len2);            
    }
}
