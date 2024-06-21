package CH17.CH17_5;

interface MyMath{
    int add(int x, int y);
    int sub(int x, int y);
    int mul(int x, int y);
    int div(int x, int y);
}

interface AdvanceMath{
    int mod(int x, int y);
}

class Cal implements MyMath, AdvanceMath{
    public int add(int x, int y){
        return x + y;
    }
    public int sub(int x, int y){
        return x - y;
    }
    public int mul(int x, int y){
        return x * y;
    }
    public int div(int x, int y){
        return x / y;
    }
    public int mod(int x, int y){
        return x % y;
    }
}

public class ch17_5 {
    public static void main(String [] args){
        Cal obj = new Cal();
        System.out.println("結果 = " + obj.add(10, 5));
        System.out.println("結果 = " + obj.sub(10, 5));
        System.out.println("結果 = " + obj.mul(10, 5));
        System.out.println("結果 = " + obj.div(10, 5));
        System.out.println("結果 = " + obj.mod(10, 5));
    }
}
