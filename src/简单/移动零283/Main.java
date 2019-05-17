package 简单.移动零283;

public class Main {
    public static void main(String[] args) {
        int[] nums  = {0,1,0,3,12};
        test(nums);
    }

    private static void test(int[] nums) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        solution.moveZeroes(nums);
        long end = System.currentTimeMillis();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }//开始时打印数组

        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
