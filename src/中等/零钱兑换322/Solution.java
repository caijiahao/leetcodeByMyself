package 中等.零钱兑换322;

public class Solution {
    public int coinChange(int[] coins, int amount) {
        if(amount<0 || coins.length == 0){
            return -1;
        }
        int[] f = new int[amount+1];//凑i元最少需要的硬币数

        f[0] = 0;
        for(int i = 1;i<=amount;i++){
            int min = Integer.MAX_VALUE;
            for(int c : coins){
                int j = i -c;// 记录用掉这个钱币，剩余的钱数
                if(j>=0 && f[j] != -1){// j元也能凑成功
                    min = Math.min(min,f[j]);
                }
                f[i] = min == Integer.MAX_VALUE ? -1 : min + 1;//min == Integer.MAX_VALUE 说明花掉这个硬币，不能凑成功，如果凑成功，硬币数+1
            }
        }
        return f[amount];
    }
}
