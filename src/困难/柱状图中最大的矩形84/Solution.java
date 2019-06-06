package 困难.柱状图中最大的矩形84;

import java.util.Stack;

public class Solution {
    public int largestRectangleArea(int[] heights) {
          int len = heights.length;
          Stack<Integer> s = new Stack<Integer>();

          int maxArea = 0;
          for(int i = 0;i<=len;i++){
              int h = (i == len?0:heights[i]); //结束时需要加个0 将其结果计算出
              if(s.isEmpty() || h >= heights[s.peek()]){
                  s.push(i);
              }else{
                  int tp = s.pop();
                  maxArea = Math.max(maxArea,heights[tp]*(s.isEmpty()?i:i-1-s.peek()));
                  i--;
              }
          }
          return maxArea;
    }
}
