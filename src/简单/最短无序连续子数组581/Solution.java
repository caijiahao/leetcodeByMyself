package 简单.最短无序连续子数组581;

import java.util.Arrays;

public class Solution {
    public int findUnsortedSubarray(int[] nums) {
         int min = nums[0];
         int max = nums[0];
         int begin = 0;
         int count = 0;
         int end = 0;
         if(nums.length == 1){
             return 0;
         }
         int[] nums1 = Arrays.copyOf(nums,nums.length);
         Arrays.sort(nums1);
         for(int i =0;i<nums.length;i++){
             if(nums1[i] == nums[i]){
                 continue;
             }
             else{
                 count+=1;
                 end = i; //记录最后一个不一样的值
                 if(count==1){
                     begin=i;//记录第一个不一样的值
                 }
             }
         }
         return count == 0?0:end-begin+1;
    }
}
