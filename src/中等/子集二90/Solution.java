package 中等.子集二90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<List<Integer>> res =null;
    public List<List<Integer>> subsetsWithDup(int[] nums){
        res = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        res.add(new ArrayList<Integer>(r));
        if(nums.length<0){
            return res;
        }
        Arrays.sort(nums);
        dfs(0,nums,r);
        return res;
    }

    public void dfs(int index,int[] nums,List<Integer> re){
        for(int i = index;i< nums.length;i++){
            Integer a = nums[i];
            re.add(nums[i]);
            if(res.contains(re)){
                re.remove(a);
                continue;
            }
            res.add(new ArrayList<Integer>(re));
            dfs(i+1,nums,re);
            re.remove(a);
        }
    }

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums = {1,2,2};
        System.out.println(solution.subsetsWithDup(nums).toString());
    }
}
