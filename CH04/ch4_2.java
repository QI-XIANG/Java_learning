package CH04;

public class ch4_2 {
    public static void main(String [] args){
        int a = 10, b = 18, c= 5;
        int s = a + b - c;
        System.out.printf("%d\n", s);
        s = 2 * a + 3 - c;
        System.out.printf("%d\n", s);
        s = b * c + 18 / b;
        System.out.printf("%d\n", s);
        s = a % c * b + 10;
        System.out.printf("%d\n", s);
        s = a * c - a * b * c;
        System.out.printf("%d\n", s);
    }    
}
