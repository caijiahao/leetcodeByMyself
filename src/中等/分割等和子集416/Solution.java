package 中等.分割等和子集416;

public class Solution {
    public boolean canPartition(int[] nums) {
       int sum = 0;
       for(int num:nums)
           sum+=num;
       //判断是否是偶数
       if((sum&1) == 1)return false;
       sum >>=1;
       boolean[] dp = new boolean[sum+1];
       dp[0] = true;
       for(int j=0;j<nums.length;j++){
           for(int i=sum;i>=nums[j];i--){
               dp[i] = dp[i] || dp[i-nums[j]];
           }
           if(dp[sum]) return true;
       }
       return dp[sum];
    }
}
