package 中等.组合总和一39;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        test(candidates, target);
    }

    private static void test(int[] candidates, int target) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        List<List<Integer>> res = solution.combinationSum(candidates, target);
        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
