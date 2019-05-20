package 中等.跳跃游戏55;

public class Solution {
    /**
 * 贪心寻找上界！！！！还有这题是不寻找路线的！！！
 * */
    public boolean canJump(int[] nums) {
        int reach = 0;
        int i = 0;
        while(i<nums.length&&i<=reach){
            reach = Math.max(reach,i+nums[i]);
            i++;
        }
        return reach>=nums.length-1;
    }
}
