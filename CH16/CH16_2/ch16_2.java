package CH16.CH16_2;

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

class Cylinder extends Circle{
    protected double height;
    Cylinder(double r, double height){
        super(r);
        this.height = height;
    }
    public double area(){
        return 2 * super.area() + super.perimeter() * height;
    }
    public double volume(){
        return super.area() * height;
    }
}

public class ch16_2 {
    public static void main(String [] args){
        Rectangle rectangle = new Rectangle(2, 3);
        Circle circle = new Circle(2);
        Cylinder cylinder = new Cylinder(2, 5);
        System.out.println("矩形面積: " + rectangle.area());
        System.out.println("圓面積: " + circle.area());
        System.out.println("圓柱體積: " + cylinder.volume());
    }
}
