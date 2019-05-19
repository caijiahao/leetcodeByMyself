package 中等.三数之和15;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums  = {-1, 0, 1, 2, -1, -4};
        test(nums);
    }

    private static void test(int[] nums) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        List<List<Integer>> res = solution.threeSum(nums);
        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
