package 简单.两数之和输入有序数组167;



public class Main {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        test(numbers,target);
    }

    private static void test(int[] numbers,int target) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        System.out.println(solution.twoSum(numbers,target)[0]);
        System.out.println(solution.twoSum(numbers,target)[1]);
        long end = System.currentTimeMillis();


        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
