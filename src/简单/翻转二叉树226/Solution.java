package 简单.翻转二叉树226;

import java.util.Stack;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
          if(root == null){
              return null;
          }
        Stack<TreeNode> stack = new Stack<>();
          stack.push(root);
          while(!stack.empty()){
              TreeNode node = stack.pop();
              TreeNode temp = node.left;
              node.left = node.right;
              node.right = temp;
              if(node.left!=null){
                  stack.push(node.left);
              }
              if(node.right!=null){
                  stack.push(node.right);
              }
          }
          return root;
    }
}
