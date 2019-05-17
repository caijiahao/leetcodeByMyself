package 简单.一百三十六;



public class Main {
    public static void main(String[] args) {
        int[] prices = {4,1,2,1,2};
        test(prices);
    }

    private static void test(int[] prices) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        System.out.println(solution.singleNumber(prices));
        long end = System.currentTimeMillis();


        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
