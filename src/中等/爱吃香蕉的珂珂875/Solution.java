package 中等.爱吃香蕉的珂珂875;

public class Solution {
    public int minEatingSpeed(int[] piles, int H) {
        int left =1;
        int right = 1000000000;
        while(left<right){  //二分查找这个范围里面的数(作为速度)是否满足条件
            int mid = left +(right-left)/2;
            if(canSucceed(piles,mid,H)){
                right = mid;
            }else{
                left = mid +1;
            }
        }
        return left;
    }

    private boolean canSucceed(int[] piles,int k,int H){
        int time = 0;
        for(int num :piles){
            if(num%k!=0){
                time = time +1;
            }
            time = time +num/k;
        }
        return time<=H;
    }
}
