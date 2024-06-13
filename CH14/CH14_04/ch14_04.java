package CH14.CH14_04;

class MyMath{
    protected int square(int x){
        return x * x;
    }
}

class Circle{
    protected MyMath obj;
    public double getArea(int radius, int height){
        obj = new MyMath();
        int rSquare = obj.square(radius);
        return 3.14 * rSquare * height;
    }
}

public class ch14_04 {
    public static void main(String [] args){
        Circle circle = new Circle();
        double area = circle.getArea(5, 10);
        System.out.println("圓柱體積是: " + area);
    }
}
