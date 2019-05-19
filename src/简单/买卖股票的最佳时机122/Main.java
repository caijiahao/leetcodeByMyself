package 简单.买卖股票的最佳时机122;



public class Main {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        test(prices);
    }

    private static void test(int[] prices) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        System.out.println(solution.maxProfit(prices));
        long end = System.currentTimeMillis();


        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
