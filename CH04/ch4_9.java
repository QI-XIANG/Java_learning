package CH04;

public class ch4_9 {
    public static void main(String [] args){
        double PI;
        PI = 3 + 4/(2.0*3.0*4.0) - 4/(4.0*5.0*6.0) + 4/(6.0*7.0*8.0);
        System.out.printf("3 + 4/(2*3*4) - 4(4*5*6) + 4/(6*7*8) = %.15f\n", PI);
        PI = 3 + 4/(2.0*3.0*4.0) - 4/(4.0*5.0*6.0) + 4/(6.0*7.0*8.0) - 4/(8.0*9.0*10.0);
        System.out.printf("3 + 4/(2*3*4) - 4(4*5*6) + 4/(6*7*8) - 4/(8*9*10) = %.16f\n", PI);
    }
}
