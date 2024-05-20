package CH10;

public class ch10_5 {
    public static void main(String[] args) {
        double rate1 = 0.012;
        double rate2 = 0.06;
        double rate3 = 0.1;
        double capital = 100000;
        double capitalInfo1, capitalInfo2, capitalInfo3;
        System.out.printf("\t\t\t1.2\t6.0\t\t10.0\n");
        for (int i = 1; i <= 20; i++) {
            capitalInfo1 = capital * Math.pow((1.0 + rate1), i);
            capitalInfo2 = capital * Math.pow((1.0 + rate2), i);
            capitalInfo3 = capital * Math.pow((1.0 + rate3), i);
            System.out.printf("第 %2d 年後本金和是 %10.2f\t", i, capitalInfo1);
            System.out.printf("%10.2f\t", capitalInfo2);
            System.out.printf("%10.2f\t", capitalInfo3);
            System.out.println();
        }
    }
}
