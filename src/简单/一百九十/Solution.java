package 简单.一百九十;

public class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for(int i =0;i<32;i++){
            res = (res<<1) + (n & 1);
            System.out.println(res);
            n = n >>> 1;
            System.out.println(n);
        }
        return res>>>0;
    }
}
