package 中等.解码方法91;

public class Solution {
    public int numDecodings(String s) {
        if(s.equals("0")){
            return 0;
        }
        int[] dp = new int[s.length()+1];
        char[] ss = s.toCharArray();
        if(ss[0]>48){
            dp[0] = 1;
            dp[1] = 1;
        }else{
            dp[0] = 0;
            dp[1] = 0;
        }
        for(int i=2;i<dp.length;i++){
            int two=ss[i-1]-48+(ss[i-2]-48)*10;
            if(two<27&&two>0&&(ss[i-2]-48)>0){
                if(ss[i-1]!=48){
                    dp[i] = dp[i-2]+dp[i-1];
                }else{
                    dp[i] = dp[i-2];
                }
            }else{
                if(two == 0 || ss[i-1] == 48){
                    dp[i] = 0;
                }else{
                    dp[i] = dp[i-1];
                }
            }
        }
        return dp[s.length()];
    }
    public static void main(String[] args) {
        Solution a=new Solution();
        System.out.println(a.numDecodings("12"));
    }
}
