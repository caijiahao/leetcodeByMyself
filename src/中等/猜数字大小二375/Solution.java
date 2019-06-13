package 中等.猜数字大小二375;

public class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n+1][n+1];
        for(int j = 2;j<=n;j++){
            for(int i = j-1;i>=0;i--){
                int global_min = Integer.MAX_VALUE;
                for(int k = i+1;k<j;k++){
                    int max = k + Math.max(dp[i][k - 1], dp[k + 1][j]);
                    global_min = Math.min(global_min,max);
                }
                dp[i][j] = i + 1 == j ? i : global_min;//当i == j - 1时，dp[i][j]即为i j中的较小者i
            }
        }
        return dp[1][n];
    }
}
