package 中等.目标和494;

public class Solution {
    public int findTargetSumWays(int[] nums, int S) {
           int sum = 0;
           for(int num:nums){
               sum+=num;
           }
           if(sum<S || (S + sum) % 2 != 0){
               return 0;
           }
           return subsetSum(nums, (S + sum) / 2);
    }

    public int subsetSum(int[] nums,int s){ //以s这个数为和的子集有多少个
        int[] dp = new int[s+1];
        dp[0] = 1; //以0为和的子集有一个，是空集
        for(int num :nums){
            for(int i =s;i>=num;i--){
                dp[i] +=dp[i-num];
            }
        }
        return dp[s];
    }
}
