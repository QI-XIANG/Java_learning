package CH04;

public class ch4_8 {
    public static void main(String [] args){
        double PI;
        PI = 4 * (1 - 1/3.0 + 1/5.0 - 1/7.0 + 1/9.0);
        System.out.printf("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9) = %.16f\n", PI);
        PI = 4 * (1 - 1/3.0 + 1/5.0 - 1/7.0 + 1/9.0 - 1/11.0);
        System.out.printf("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11) = %.16f\n", PI);
        PI = 4 * (1 - 1/3.0 + 1/5.0 - 1/7.0 + 1/9.0 - 1/11.0 + 1/13.0);
        System.out.printf("4 * (1 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13) = %.16f\n", PI);
    }    
}
