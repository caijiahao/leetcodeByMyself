package 简单.两个数组的交集349;



public class Main {
    public static void main(String[] args) {
        int[] nums1  = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        test(nums1,nums2);
    }

    private static void test(int[] nums1,int[] nums2) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        int[] nums = solution.intersection(nums1,nums2);
        long end = System.currentTimeMillis();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }//开始时打印数组

        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
