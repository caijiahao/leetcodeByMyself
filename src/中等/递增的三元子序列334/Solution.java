package 中等.递增的三元子序列334;

public class Solution {
    public boolean increasingTriplet(int[] nums) {
         if(nums.length<3)
             return false;
         int min1 = Integer.MAX_VALUE;
         int min2 = Integer.MAX_VALUE;
         for(int i=0;i<nums.length;i++){
             if(nums[i]>min2){
                 return true;
             }
             if(nums[i]<min1)
                 min1 = nums[i];
             if(nums[i]>min1&&nums[i]<min2)
                 min2 = nums[i];
         }
         return false;
    }
}
