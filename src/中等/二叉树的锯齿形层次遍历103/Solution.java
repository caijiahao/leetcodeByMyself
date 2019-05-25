package 中等.二叉树的锯齿形层次遍历103;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
         Queue<TreeNode> queue = new LinkedList<>();
         List<List<Integer>> result = new ArrayList<>();
         LinkedList<Integer> list = new LinkedList<>();//一排的integer
        if(root == null){
            return result;
        }
        queue.add(root);
        int num = 1;
        int next =0;
        boolean isLTR = true;//是否这一排顺序从左到右
        while(!queue.isEmpty()){
            TreeNode now = queue.poll();
            if(now.left!=null){
                queue.add(now.left);
                next++;
            }
            if(now.right!=null){
                queue.add(now.right);
                next++;
            }
            if(isLTR){
                list.add(now.val);
            }else{
                list.addFirst(now.val);
            }
            num--;
            if(num == 0){
                num = next;
                next = 0;
                isLTR = !isLTR;
                result.add(list);
                list = new LinkedList<>();
            }
        }
        return result;
    }
}
