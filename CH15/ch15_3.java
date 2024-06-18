package CH15;

class Employee{
    String name;
    int age;
    String hometown;
    String country;
}

public class ch15_3 {
    public static void main(String [] args){
        Employee A = new Employee();
        Employee B = new Employee();
        Employee C = new Employee();
        System.out.println("A的hashCode : " + A.hashCode());
        System.out.println("B的hashCode : " + B.hashCode());
        System.out.println("C的hashCode : " + C.hashCode());
    }
}
