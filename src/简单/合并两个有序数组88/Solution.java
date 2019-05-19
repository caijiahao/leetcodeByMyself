package 简单.合并两个有序数组88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        //设置一个指针，指针初始化指向nums1的末尾
        //然后不断左移指针更新元素
        int index=m+n-1;
        int i = m-1,j = n-1;

        while(index>=0){
            if(i<0){
                nums1[index--]=nums2[j--];
            }else if(j<0){
                nums1[index--]=nums1[i--];
            }else if(nums1[i]>nums2[j]&&i>=0){
                nums1[index--]=nums1[i--];
            }else if(nums1[i]<=nums2[j]&&i>=0){
                nums1[index--]=nums2[j--];
            }

        }

    }
}
