package 中等.逆波兰表达式求职150;

import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
         int length = tokens.length;
         if(length == 0){
             return 0;
         }
        Stack<Integer> stack = new Stack<>();
         for(int i=0;i<length;i++){
             String nowStr = tokens[i];
             if(nowStr.equals("+")||nowStr.equals("-")||
                     nowStr.equals("*")||nowStr.equals("/")){
                 Integer second = stack.pop();
                 Integer first = stack.pop();
                 Integer result=0;
                 if(nowStr.equals("+")){
                     result=first+second;
                 }
                 if(nowStr.equals("-")){
                     result=first-second;
                 }
                 if(nowStr.equals("*")){
                     result=first*second;
                 }
                 if(nowStr.equals("/")){
                     result=first/second;
                 }
                 stack.push(result);
             }else{
                 Integer now = Integer.valueOf(nowStr);
                 stack.push(now);
                 continue;
             }
         }
        return stack.pop();
    }
}
