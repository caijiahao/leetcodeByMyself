package 中等.全排列二47;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         List<List<Integer>> res = new ArrayList<>();
         List<Integer> list = new ArrayList<>();
         List<Integer> is = new ArrayList<>();
         huisu(is,nums,list,res);
         return res;
    }

    private void huisu(List<Integer> is,int[] nums,List<Integer> list,List<List<Integer>> res){
        if(list.size() == nums.length&&!res.contains(list)){
            //指向新的一片地址空间使其变成不在跟随l改变而改变
            res.add(new ArrayList<Integer>(list));
            return;
        }else{
            for(int i=0;i<nums.length;i++){
                if(is.contains(i))continue;
                list.add(nums[i]);
                is.add(i);
                huisu(is,nums,list,res);
                //退回一格
                list.remove(list.size()-1);
                is.remove(is.size()-1);
            }
        }
    }
}
