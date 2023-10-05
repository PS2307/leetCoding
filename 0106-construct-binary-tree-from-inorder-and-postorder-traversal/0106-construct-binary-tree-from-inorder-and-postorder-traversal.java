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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer,Integer> inOrderMap=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inOrderMap.put(inorder[i],i);
        }
        return splitTree(postorder,inOrderMap,postorder.length-1,0,inorder.length-1);
        
    }
    private TreeNode splitTree(int[] postorder, Map<Integer,Integer> inOrderMap,int rootIndex,int left,int right){
        TreeNode node=new TreeNode(postorder[rootIndex]);
        int mid=inOrderMap.get(postorder[rootIndex]);
        if(mid>left) node.left=splitTree(postorder,inOrderMap,rootIndex+mid-right-1,left,mid-1);
        if(mid<right) node.right=splitTree(postorder,inOrderMap,rootIndex-1,mid+1,right);
        return node;
    }
}