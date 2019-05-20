package 中等.组合总数二40;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        test(candidates, target);
    }

    private static void test(int[] candidates, int target) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        List<List<Integer>> res = solution.combinationSum2(candidates, target);
        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
