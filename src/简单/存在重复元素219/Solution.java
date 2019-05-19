package 简单.存在重复元素219;

import java.util.HashMap;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int sub = i - hm.get(nums[i]);
                if(sub<=k){
                    return true;
                }else{
                    hm.put(nums[i],i);
                }
            }else{
                hm.put(nums[i],i);
            }
        }
        return false;
    }
}
