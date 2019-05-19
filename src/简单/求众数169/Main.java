package 简单.求众数169;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {2,2,1,1,1,2,3};
        test(numbers);
    }

    private static void test(int[] numbers) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        System.out.println(solution.majorityElement(numbers));

        long end = System.currentTimeMillis();


        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
