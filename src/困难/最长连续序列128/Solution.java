package 困难.最长连续序列128;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int longestConsecutive(int[] nums) {
          if(nums == null || nums.length == 0){  //判断边界条件
              return 0;
          }

        //key是nums数组的值，value对应的是每一个nums[i]处连续的序列的个数
        Map<Integer,Integer> param = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!param.containsKey(nums[i])){ //hashMap中没有该元素的时候。
                param.put(nums[i],1);  //初始化认为与该元素相邻的只有一个。
                int temp = nums[i];
                boolean flag = false;
                if (param.containsKey(temp + 1)) {
                    while(param.containsKey(temp+1)){
                        temp++;
                    }
                    param.put(temp,param.get(temp)+1);
                    param.put(nums[i],param.get(temp));
                    flag =true;
                }

                int temp2 = nums[i];
                int count = 0;
                if(param.containsKey(temp2-1)){
                    while(param.containsKey(temp2-1)){
                        temp2--;
                        count++;
                    }
                    if(flag){
                        param.put(temp,param.get(temp)+count);
                        param.put(temp2,param.get(temp));
                    }else{
                        param.put(temp2,param.get(temp2)+1);
                        param.put(nums[i],param.get(temp2));
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for(Integer key:param.keySet()){
            if(max<param.get(key)){
                max = param.get(key);
            }
        }
        return max;
    }
}
