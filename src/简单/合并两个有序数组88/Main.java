package 简单.合并两个有序数组88;

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3,n = 3;
        test(nums1,m,nums2,n);
    }

    private static void test(int[] nums1, int m, int[] nums2, int n) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        solution.merge(nums1,m,nums2,n);
        long end = System.currentTimeMillis();
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }//开始时打印数组

        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
