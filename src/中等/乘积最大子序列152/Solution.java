package 中等.乘积最大子序列152;

public class Solution {
    public int maxProduct(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int maxP = nums[0],minN = nums[0],dp = nums[0];
        for(int i=1;i<nums.length;i++){
            int locMax = nums[i] * maxP, locMin = nums[i] * minN;
            maxP = Math.max(nums[i],Math.max(locMax,locMin));
            minN = Math.min(nums[i],Math.min(locMax,locMin));
            dp = Math.max(dp,maxP);
        }
        return dp;
    }
}
