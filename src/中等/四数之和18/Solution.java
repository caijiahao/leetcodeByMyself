package 中等.四数之和18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]) {
                continue;
            }
            for(int j = i+1;j<nums.length;j++){
                if(j>1&&nums[j]==nums[j-1]) {
                    continue;
                }
                int m = j+1;
                int n = nums.length-1;
                int flag = target -nums[i]-nums[j];
                while(m<n){
                    if(nums[m]+nums[n] == flag){
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[m]);
                        list.add(nums[n]);
                        res.add(list);
                        while(m<n&&nums[m]==nums[m+1]) {
                            m++;
                        }
                        while(m<n&&nums[n]==nums[n-1]) {
                            n--;
                        }
                        m++;
                        n--;
                    }else if(nums[m]+nums[n]<flag) {
                        m++;
                    }else {
                        n--;
                    }
                }
            }
        }
        return res;
    }
}
