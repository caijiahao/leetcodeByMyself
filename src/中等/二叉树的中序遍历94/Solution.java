package 中等.二叉树的中序遍历94;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
         List<Integer> list = new ArrayList<>();
         preHeader(root,list);
         return list;
    }

    private static void preHeader(TreeNode root,List<Integer> list){
        if(root==null) return;
        //这个顺序是根据它是什么遍历的顺序
        preHeader(root.left,list);
        list.add(root.val);
        preHeader(root.right,list);
    }
}
