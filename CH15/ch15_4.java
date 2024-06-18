package CH15;

public class ch15_4 {
    public static void main(String [] args){
        Employee A = new Employee();
        Employee B = new Employee();
        Employee C = new Employee();
        System.out.println("A = B : " + A.equals(B));
        System.out.println("A = C : " + A.equals(C));
        System.out.println("B = C : " + B.equals(C));
    }
}
