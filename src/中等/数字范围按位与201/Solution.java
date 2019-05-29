package 中等.数字范围按位与201;

public class Solution {
    public int rangeBitwiseAnd(int m, int n) {
         int count = 0;
         while(m!=n){
             m = m >>1;
             n = n >>1;
             count++;
         }
         return n << count;
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println(solution.rangeBitwiseAnd(5,7));
    }
}

