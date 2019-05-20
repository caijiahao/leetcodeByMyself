package 中等.全排列46;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        huisu(nums,l,result);
        return result;
    }

    private void huisu(int[] nums,List<Integer> list,List<List<Integer>> res){
        if (list.size()==nums.length){
            //指向新的一片地址空间使其变成不在跟随l改变而改变
            res.add(new ArrayList<Integer>(list));
            return;
        }else{
            for(int i=0;i<nums.length;i++){
                //判断
                if(list.contains(nums[i]))continue;
                list.add(nums[i]);
                huisu(nums,list,res);
                //退回一格
                list.remove(list.size()-1);
            }
        }

    }
}
