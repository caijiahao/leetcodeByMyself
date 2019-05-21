package 中等.子集78;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length == 0){
            return res;
        }
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        //必须有一个空集
        res.add(new ArrayList<Integer>());
        dfs(nums,0,list,res);
        return res;
    }

    public static void dfs(int[] s,int start,List<Integer> list,List<List<Integer>> res){
        for(int i=start;i<s.length;i++){
            list.add(s[i]);
            res.add(new ArrayList<Integer>(list));
            dfs(s,i+1,list,res);
            list.remove(list.size()-1);
        }
    }
}
