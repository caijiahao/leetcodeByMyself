package 中等.石子游戏877;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;

public class Solution {
    public boolean stoneGame(int[] piles) {
       int N = piles.length;
       int[][] dp = new int[N][N];
       for(int i=0;i<N;i++){
           dp[i][i] = piles[i];
       }

       for(int left = N-2;left>-1;left--){
           for(int right = left+1;right<N;right++){
               int choseLeft = piles[left] - dp[left+1][right];
               int choseRight = piles[right] - dp[left][right+1];
               dp[left][right] = Math.max(choseLeft,choseRight);
           }
       }

        if(dp[0][N-1]>=0){
            return true;
        }else{
            return false;
        }
    }
}
