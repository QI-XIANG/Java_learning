package CH09;

class MyMath{
    int x;
    void math(int a){
        x = a;
    }
    void math(int a, int b){
        x = a * b;
    }
    void math(int a, int b, int c){
        x = a * b * c;
    }
    void printInfo(){
        System.out.println(x);
    }
    void getMax(int a){
        x = Math.max(0, a);
    }
    void getMax(int a, int b){
        x = Math.max(a, b);
    }
    void getMax(int a, int b, int c){
        x = Math.max(a, b);
        if(c >= x){
            x = c;
        }
    }
}


public class ch9_1 {
    public static void main(String [] args){
        MyMath A = new MyMath();
        A.getMax(10);
        A.printInfo();
        A.getMax(5, 10);
        A.printInfo();
        A.getMax(5, 10, 15);
        A.printInfo();
    }
}
