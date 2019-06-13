package 简单.缺失数字268;

public class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int elem :nums){
            sum+=elem;
        }
        return ((1 + nums.length)*nums.length/2) - sum;
    }
}
