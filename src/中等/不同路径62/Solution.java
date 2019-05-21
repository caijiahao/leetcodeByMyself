package 中等.不同路径62;

public class Solution {
    //使用深度搜索不能过，所以考虑用动态规划
    public int uniquePaths(int m, int n) {
       if(m<=0||n<=0){
           return 0;
       }
       if(m == 1|| n==1){
           return 1;
       }

       int[][] nums = new int[n][m];
       for(int i=0;i<n;i++){
            nums[i][0]=1;
        }
       for(int i=0;i<m;i++){
            nums[0][i]=1;
        }

       for(int i = 1;i<n;i++){
           for(int j = 1;j<m;j++){
               nums[i][j]=nums[i-1][j]+nums[i][j-1];
           }
       }
        return nums[n-1][m-1];
    }
}
