package CH16.CH16_1;

abstract class Shape{
    public abstract double area();
    public abstract double perimeter();
}

class Rectangle extends Shape{
    protected double height, width;
    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double area(){
        return height * width;
    }
    public double perimeter(){
        return 2 * (height + width);
    }
}

class Circle extends Shape{
    protected double r;
    Circle(double r){
        this.r = r;
    }
    public double area(){
        return Math.PI * r * r;
    }
    public double perimeter(){
        return 2 * Math.PI * r;
    }
}

public class ch16_1 {
    public static void main(String [] args){
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(2);
        System.out.println("矩形面積: " + rectangle.area());
        System.out.println("矩形周長: " + rectangle.perimeter());
        System.out.println("圓面積: " + circle.area());
        System.out.println("圓周長: " + circle.perimeter());
    }
}
