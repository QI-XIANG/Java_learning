package CH16.CH16_3;

abstract class MyMath{
    abstract int add(int n1, int n2);
    abstract int mul(int n1, int n2);
    abstract int sub(int n1, int n2);
    abstract int div(int n1, int n2);
    void output(){
        System.out.println("我的計算器");
    }
}

class MyTest extends MyMath{
    public int add(int n1, int n2){
        return n1 + n2;
    }
    public int mul(int n1, int n2){
        return n1 * n2;
    }
    public int sub(int n1, int n2){
        return n1 - n2;
    }
    public int div(int n1, int n2){
        return n1 / n2;
    }
}

public class ch16_3 {
    public static void main(String [] args){
        MyMath obj = new MyTest();
        obj.output();
        System.out.println("加法結果: " + obj.add(10, 3));
        System.out.println("乘法結果: " + obj.mul(10, 3));
        System.out.println("減法結果: " + obj.sub(10, 3));
        System.out.println("整數除法結果: " + obj.div(10, 3));
    }
}
