package 中等.无重复字符的最长子串03;

public class Solution {
    public int lengthOfLongestSubstring1(String s) {
        int[] m =new int[256];

        int res = 0,left = 0;
        for(int i=0;i<s.length();i++){
            left = Math.max(left,m[s.charAt(i)]);

            res = Math.max(res,i-left+1);

            m[s.charAt(i)] = i+1;
        }
        return res;
    }
}
