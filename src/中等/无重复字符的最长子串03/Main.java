package 中等.无重复字符的最长子串03;

public class Main {
    public static void main(String[] args) {
        //int[] nums  = {0,1,0,3,12};
        String s = "pwwkew";
        test(s);
    }

    private static void test(String s) {
        Solution solution = new Solution();
        long begin = System.currentTimeMillis();
        System.out.println(solution.lengthOfLongestSubstring1(s));
        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
