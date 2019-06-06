package 中等.零钱兑换二518;

public class Solution {
    public int change(int amount, int[] coins) {
        if (amount == 0) {
            return 1;
        }
        if (coins.length == 0)
            return 0;
        int len = coins.length;
        int[][] dp = new int[len][amount + 1];

        for (int i = 0; i < amount + 1; i++) {
            if (i % coins[0] == 0) {
                dp[0][i] = 1;
            }
        }

        for (int i = 1; i < len; i++) {
            dp[i][0] = 1;
            for (int j = 1; j < amount + 1; j++) {
                if (j - coins[i] >= 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - coins[i]];
                } else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[len - 1][amount];
    }
}
