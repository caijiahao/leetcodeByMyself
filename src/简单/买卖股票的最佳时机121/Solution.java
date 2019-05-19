package 简单.买卖股票的最佳时机121;

public class Solution {

    //动态规划，选取最小的卖，最大的买，利润最大。
    public int maxProfit(int[] prices) {
       int result = 0;
       if(prices==null||prices.length == 0){
           return 0;
       }
       int minbuy = prices[0];
       for(int i=1;i<prices.length;i++){
           result = Math.max(result,prices[i]-minbuy);
           minbuy = Math.min(prices[i],minbuy);
       }
       return result;
    }


    //利用分治的方法来求解
    public int findMaxCrossingSubarray(int[] A,int low,int mid,int high){
        if(low > mid || mid >high){
            return Integer.MIN_VALUE;
        }
        int leftSum = Integer.MIN_VALUE;
        int rightSum = Integer.MIN_VALUE;
        int sum = 0;
        int maxright = -1;
        int maxleft = -1;

        for(int i = mid;i>=low;i--){
            sum+=A[i];
            if(sum>=leftSum){ // 向左只要和增加就更新
                leftSum = sum;
                maxleft = i;
            }
        }

        sum = 0;
        for(int j = mid+1;j<=high;j++){
            sum+=A[j];
            if(sum>=rightSum){
                rightSum = sum;
                maxright = j;
            }
        }
        return leftSum + rightSum;
    }

    public int findMaxSubarray(int[] A,int low,int high){
        if(low == high)
            return Math.max(A[low],0);
        else{
            int mid = low + (high - low)/2;//防止越界
            int leftSum = findMaxSubarray(A,low,mid);//(1)
            int rightSum = findMaxSubarray(A,mid+1,high);//(2)
            int midSum = findMaxCrossingSubarray(A,low,mid,high);//(3)
            int sum = Math.max(leftSum,rightSum);
            sum = Math.max(sum,midSum);
            sum = Math.max(sum,0);
            return sum;
        }
    }
}
