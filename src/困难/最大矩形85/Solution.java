package 困难.最大矩形85;

import java.util.Stack;

public class Solution {
    public int maximalRectangle(char[][] matrix) {
         if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
             return 0;
         }
         int maxArea = 0;
         int[] height = new int[matrix[0].length];
         for(int i=0;i<matrix.length;i++){
             for(int j =0;j<matrix[0].length;j++){
                 height[j] = matrix[i][j] == '0'?0:height[j]+1;
             }
             maxArea = Math.max(maxArea,largestRectangleArea(height));
         }
         return maxArea;
    }

    public static int largestRectangleArea(int[] heights){
        if(heights == null || heights.length == 0)
            return 0;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();//从栈底到栈顶依次增大
        for(int i=0;i<heights.length;i++){
            while(!stack.isEmpty() && heights[i] <= heights[stack.peek()]){
                //栈不为空并且当前值小于等于栈顶元素
                int j = stack.pop();
                int k = stack.isEmpty()?-1:stack.peek();
                int curArea = (i-k-1)*heights[j];//底乘高
                maxArea = Math.max(maxArea,curArea);
            }
            stack.push(i);//i 进栈
        }
        while(!stack.isEmpty()){
            //数组遍历完了，栈内还有值
            int j = stack.pop();
            int k = stack.isEmpty() ? -1 : stack.peek();
            int curArea = (heights.length - k - 1) * heights[j];
            maxArea = Math.max(maxArea,curArea);
        }
        return maxArea;
    }
}
