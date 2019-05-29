package 中等.最佳买卖股票时机含冷冻期309;

public class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0)
            return 0;
        int[] dh=new int[n];
        int[] h=new int[n];
        dh[0]=0;
        h[0]=-prices[0];
        for(int i=1;i<n;i++){
            dh[i]=Math.max(dh[i-1],h[i-1]+prices[i]);
            if(i>=2)
                h[i]=Math.max(h[i-1],dh[i-2]-prices[i]);
            else
                h[i]=Math.max(h[i-1],-prices[i]);
        }
        return dh[n-1];
    }
}
