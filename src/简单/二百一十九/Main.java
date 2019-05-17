package 简单.二百一十九;

public class Main {
    public static void main(String[] args) {
        int[] nums  = {1,2,3,1,2,3};
        int k = 2;
        test(nums,k);
    }

    private static void test(int[] nums ,int k) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        System.out.println(solution.containsNearbyDuplicate(nums,k));
        long end = System.currentTimeMillis();


        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
