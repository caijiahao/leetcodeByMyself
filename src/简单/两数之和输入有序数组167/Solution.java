package 简单.两数之和输入有序数组167;

public class Solution {
    //因为数组是有序的，那么两个指针，一个在头一个在尾，一层循环就能保证结果正确
    public int[] twoSum(int[] numbers,int target){
        int start = 0;
        int end = numbers.length-1;
        int result[] = new int[2];
        while(start<end){
            int temp = numbers[start] + numbers[end];
            if(temp == target){
                result[0] = start + 1;
                result[1] = end + 1;
                return result;
            }else if(temp < target){ //如果相加小于target 说明start处太小！因为end已经是最大的了
                int t = numbers[start];
                start++;
                while(numbers[start] == t){
                    start++;
                }
            }else{
                int t=numbers[end];
                end--;
                while (numbers[end]==t){//道理同上
                    end--;
                }
            }
        }
        return result;
    }
}
