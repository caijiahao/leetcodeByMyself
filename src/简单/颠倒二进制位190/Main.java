package 简单.颠倒二进制位190;



public class Main {
    public static void main(String[] args) {
        int n = 43261596;
        test(n);
    }

    private static void test(int n) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        System.out.println(solution.reverseBits(n));
        long end = System.currentTimeMillis();


        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
