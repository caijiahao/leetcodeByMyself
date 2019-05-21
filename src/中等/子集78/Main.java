package 中等.子集78;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums  = {1,2,3};
        test(nums);
    }

    private static void test(int[] nums) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        List<List<Integer>> res = solution.subsets(nums);
        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
