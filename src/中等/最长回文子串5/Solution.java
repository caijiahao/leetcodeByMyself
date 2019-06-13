package 中等.最长回文子串5;

public class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        if(n<=1) return s;

        String longest = "";

        String str;
        for(int i=0;i<n-1;i++){
            str = findPalindrome(s,i,i);
            if(str.length()>longest.length()){
                longest = str;
            }
            str = findPalindrome(s,i,i+1);
            if(str.length()>longest.length()){
                longest = str;
            }
        }
        return longest;
    }

    public String findPalindrome(String s,int left,int right){
        int n = s.length();
        int l = left;
        int r = right;
        while(l>=0 && r<=n-1&&s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}
