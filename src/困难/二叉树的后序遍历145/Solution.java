package 困难.二叉树的后序遍历145;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        return postorderTraversal(root,list);
    }

    public List<Integer> postorderTraversal(TreeNode root,ArrayList<Integer> list){
        if(root!=null){
            if(root.left!=null){
                postorderTraversal(root.left,list);
            }
            if(root.right!=null){
                postorderTraversal(root.right,list);
            }
            list.add(root.val);
        }
        return list;
    }
}
