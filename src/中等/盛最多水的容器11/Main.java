package 中等.盛最多水的容器11;

public class Main {
    public static void main(String[] args) {
        int[] height  = {1,8,6,2,5,4,8,3,7};
        test(height);
    }

    private static void test(int[] height) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        System.out.println(solution.maxArea(height));
        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
