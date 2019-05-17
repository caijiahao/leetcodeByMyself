package 简单.二十六;

public class main {
    public static void main(String[] args) {
        int[][] testTable = {{1, 1, 2}, {1, 1, 2, 2, 5, 6, 7, 7}, {1, 2, 3, 5}, {1, 1, 1, 1}};
        for (int[] ito : testTable) {
            test(ito);
        }
    }

    private static void test(int[] ito) {
        Solution solution = new Solution();
        int rtn;
        long begin = System.currentTimeMillis();
        for (int i = 0; i < ito.length; i++) {
            System.out.print(ito[i] + " ");
        }//开始时打印数组
        rtn = solution.removeDuplicates(ito);//执行程序
        long end = System.currentTimeMillis();
        System.out.println(ito + ": rtn=" + rtn);
        for (int i = 0; i < rtn; i++) {
            System.out.print(ito[i] + " ");
        }//打印结果几数组
        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}

