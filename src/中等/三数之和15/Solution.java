package 中等.三数之和15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            if(nums[i]>0) break;        //如果三个数都大于零和不可能小于零

            if(i>0&&nums[i] == nums[i-1])continue;    //去重
            int target = 0-nums[i];
            int l = i+1,r = len-1;        //此处必须对i后面的数字进行筛选，不能重复

            while(l<r){
                List<Integer> list = new ArrayList<>();
                if(nums[l]+nums[r] == target){
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    res.add(list);
                    while(r>l&&nums[l+1] == nums[l]){
                        l++;
                    }

                    while(r>l&&nums[r] == nums[r-1]){
                        r--;
                    }
                    l++;r--;
                }else if(nums[l]+nums[r]>target) {
                    r--;
                }else{
                    l++;
                }
            }
        }
        return res;
    }
}
