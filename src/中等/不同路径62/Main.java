package 中等.不同路径62;

public class Main {
    public static void main(String[] args) {
        int m = 23,n =12;
        test(m, n);
    }

    private static void test(int m, int n) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        int count = solution.uniquePaths(m, n);
        long end = System.currentTimeMillis();

        System.out.println(count);
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
