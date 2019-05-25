package 中等.二叉树的层次遍历102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> rowResult = new ArrayList<Integer>();
        if(root == null){
            return result;
        }
        int num =1;
        int next = 0;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode now = queue.poll();
            rowResult.add(now.val);
            num--;
            if(now.left!=null){
                queue.add(now.left);
                next++;
            }
            if(now.right!=null){
                queue.add(now.right);
                next++;
            }

            if(num==0){
                num = next;
                next = 0;
                result.add(rowResult);
                rowResult = new ArrayList<Integer>();
            }
        }
        return result;
    }
}
