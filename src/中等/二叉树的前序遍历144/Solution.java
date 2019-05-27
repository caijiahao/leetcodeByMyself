package 中等.二叉树的前序遍历144;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> resultList = new ArrayList<>();
         if(root == null){
             return resultList;
         }
         helper(resultList,root);
         return resultList;
    }

    public void helper(List<Integer> resultList,TreeNode root){
        if(root == null){
            return;
        }
        resultList.add(root.val);
        helper(resultList,root.left);
        helper(resultList,root.right);
    }
}
