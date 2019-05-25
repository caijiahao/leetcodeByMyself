package 中等.单词拆分139;

import java.util.List;

public class Solution {
    //使用动态规划
    public boolean wordBreak(String s, List<String> wordDict) {
        int len = s.length();
        //len+1
        //dp[i]表示前i个字符能不能被dict完美划分
        boolean[] dp = new boolean[len+1];
        dp[0] = true;
        for(int i = 1;i<=len;i++){
            for(int j = 0;j<i;j++){
                // 注意substring是前闭后开
                String tmp = s.substring(j, i);
                if(dp[j]&&wordDict.contains(tmp)){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[len];
    }
}
