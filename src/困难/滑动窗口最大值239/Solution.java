package 困难.滑动窗口最大值239;

import java.util.ArrayDeque;

public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
         if(nums ==null || nums.length == 0){
             return new int[0];
         }

        ArrayDeque<Integer> adq = new ArrayDeque<>(k);
         int[] max = new int[nums.length+1-k];//获得该nums数组滑动窗口的个数
        for(int i = 0;i<nums.length;i++){
            //每当新数进来，如果发现队列的头部的数的下标是窗口最左边的下标，则移出队列
            if(!adq.isEmpty()&&adq.peekFirst() == i-k){
                adq.removeFirst();
            }

            //把队列尾部的数和新数一一比较，比新数小的都移出队列，直到该队列的末尾数比新数大或者队列为空的时候才停止，保证队列是降序的
            while(!adq.isEmpty() && nums[adq.peekLast()]<nums[i])
                adq.removeLast();
            //从尾部加入新的数
            adq.offerLast(i);
            //队列头部就是该窗口最大的数
            if(i + 1 >= k)//i+1 <k时，滑动窗口才有最大值
                max[i + 1 -k] = nums[adq.peek()];
        }
        return max;
    }
}
