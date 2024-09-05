package CH19;

public class ch19_2 {
    public static void main(String args []){
        
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("請輸入圓半徑 : ");

        double r;

        r = sc.nextDouble();

        System.out.printf("圓面積 = %.13f\n", Math.PI * r * r);
        
        sc.close();

    }
}
