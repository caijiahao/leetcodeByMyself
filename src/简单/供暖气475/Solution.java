package 简单.供暖气475;

import java.util.Arrays;

public class Solution {
    //看了别的思路
//先排序，然后给两个指针，按照顺序找到每个屋子距离最近的加热器，记录其位置差
//所有的位置差里面最长的那一个就是最小的加热器半径
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int n = houses.length;
        int m = heaters.length;
        int minimum = 0;
        int j = 0;
        for(int i=0;i<n;i++){
            while(j<m-1 && (Math.abs(heaters[j]-houses[i])>=Math.abs(heaters[j+1]-houses[i]))){
                j++;
            }
            minimum = Math.max(minimum,Math.abs(heaters[j]-houses[i]));
        }
        return minimum;
    }
}
