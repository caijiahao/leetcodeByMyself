package 中等.路径总和二113;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
         //定义一个结果集合
        List<List<Integer>> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        //定义一个中间集合
        ArrayList<Integer> arrlist = new ArrayList<>();
        path(root, list, arrlist, sum);
        return list;
    }

    public void path(TreeNode root, List<List<Integer>> list, ArrayList<Integer> arrlist,int nowSum){
        //将当前节点的值加入中间集合中
        arrlist.add(root.val);
        nowSum -= root.val;

        if(root.left == null && root.right == null){
            if(nowSum == 0){
                //如果当前节点无子女，就判断该路径是否符合要求，如果符合那么就将该路径加入结果集合中
                list.add(new ArrayList<>(arrlist));
            }
            //遍历完一条路径就回到调用点，这里也可以不写return，也会自动返回。但是加return可以略微提高效率。
            return;
        }
        if(root.left!=null){
            //左子树不为空就递归遍历左子树，要注意的是函数返回后，要将中间集合最后一个元素删除（这里体现了回溯）
            path(root.left,list,arrlist,nowSum);
            arrlist.remove(arrlist.size()-1);
        }
        if(root.right != null){
            //右子树不为空就递归遍历右子树，要注意的是函数返回后，要将中间集合最后一个元素删除（这里体现了回溯)
            path(root.right,list,arrlist,nowSum);
            arrlist.remove(arrlist.size()-1);
        }
    }
}
