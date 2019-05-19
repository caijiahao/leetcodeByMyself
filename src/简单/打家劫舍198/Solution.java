package 简单.打家劫舍198;

public class Solution {
    public int rob(int[] nums) {
       int[] dp = new int[nums.length+2];
       dp[0] = 0;
       dp[1] = 0;

       for(int i = 2;i<nums.length+2;i++){
           dp[i] = Math.max(dp[i-2]+nums[i-2],dp[i-1]);
       }
       return dp[nums.length+1];
    }
}
