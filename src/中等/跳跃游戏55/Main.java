package 中等.跳跃游戏55;

public class Main {    public static void main(String[] args) {
    int[] nums = {3,2,1,0,4};
    test(nums);
}

    private static void test(int[] nums) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        System.out.println(solution.canJump(nums));
        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }

}
