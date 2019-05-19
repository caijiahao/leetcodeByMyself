package 简单.两个数组的交集349;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List list = new ArrayList();
        Arrays.sort(nums1);//排序
        Arrays.sort(nums2);//排序
        for(int i=0;i<=nums1.length-1;i++){//排除相同的元素
            while(i+1<=nums1.length-1&&nums1[i] == nums1[i+1]){//如果有相同的元素游标向前移动
                i++;
            }

            for(int j=0;j<=nums2.length-1;j++){
                while(j+1<=nums2.length-1&&nums2[j] == nums2[j+1]){ //如果有相同的元素游标向前移动
                    j++;
                }
                if(nums1[i] == nums2[j]){ //比较两个数组的元素是否相同
                    list.add(nums1[i]);
                }
            }
        }
        int[] result = new int[list.size()];
        for(int i=0;i<=list.size()-1;i++)
            result[i] = Integer.parseInt(list.get(i).toString());
        return result;
    }
}
