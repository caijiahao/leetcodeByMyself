package 中等.颜色分类75;

public class Main {
    public static void main(String[] args) {
        int[] nums  = {2,0,2,1,1,0};
        test(nums);
    }

    private static void test(int[] nums) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        solution.sortColors(nums);
        long end = System.currentTimeMillis();
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }//开始时打印数组

        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
