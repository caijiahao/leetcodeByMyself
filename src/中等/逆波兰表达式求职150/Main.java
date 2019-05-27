package 中等.逆波兰表达式求职150;

public class Main {
    public static void main(String[] args) {
        String[][] testTable = {{"2", "1", "+", "3", "*"}, {"4", "13", "5", "/", "+"}, {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}};
        for (String[] ito : testTable) {
            test(ito);
        }
    }

    private static void test(String[] ito) {
        Solution solution = new Solution();
        int rtn;
        long begin = System.currentTimeMillis();
        for (int i = 0; i < ito.length; i++) {
            System.out.print(ito[i] + " ");
        }
        System.out.println();
        //开始时打印数组

        rtn = solution.evalRPN(ito);//执行程序
        long end = System.currentTimeMillis();

        //System.out.println(ito + ": rtn=" + rtn);
        System.out.println(" rtn=" + rtn);
		/*for (int i = 0; i < ito.length; i++) {
		    System.out.print(ito[i]+" ");
		}*///打印结果几数组

        System.out.println();
        System.out.println("耗时：" + (end - begin) + "ms");
        System.out.println("-------------------");
    }
}
