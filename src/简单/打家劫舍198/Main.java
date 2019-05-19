package 简单.打家劫舍198;

;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        test(nums);
    }

    private static void test(int[] nums) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        System.out.println(solution.rob(nums));
        long end = System.currentTimeMillis();


        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
