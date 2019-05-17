package 简单.一百六十九;

public class Solution {
    public int majorityElement(int[] nums) {
         int count = 1;
         int majority = nums[0];
         for(int i = 1;i<nums.length;i++){
             if(count == 0){
                 majority = nums[i];
             }
             if(nums[i] == majority){
                 count++;
             }else{
                 count --;
             }
         }
         return majority;
    }
}
