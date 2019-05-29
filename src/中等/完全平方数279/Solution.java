package 中等.完全平方数279;

public class Solution {
    public int numSquares(int n) {
        int[] a = new int[n+1];
        a[0] = 0;
        a[1] = 1;
        for(int i=2;i<=n;i++){
            int temp = Integer.MAX_VALUE;

            for(int j=1;j*j<=i;j++){
                temp = Math.min(temp,a[i-j*j]);
            }
            a[i] = temp+1;
        }
        return a[n];
    }
}
