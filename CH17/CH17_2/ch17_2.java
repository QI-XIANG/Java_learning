package CH17.CH17_2;

interface Shape{
    double PI = 3.14;
    double area();
}

class Rectangle implements Shape{
    protected double height, width;
    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    public double area(){
        return height * width;
    }
}

class Circle implements Shape{
    protected double r;
    Circle(double r){
        this.r = r;
    }
    public double area(){
        return PI * r * r;
    }
}

class RectangleVolume extends Rectangle{
    protected double length;
    RectangleVolume(double height, double width, double length){
        super(height, width);
        this.length = length;
    }
    public double volume(){
        return height * width * length;
    }
}

class Cyclinder extends Circle{
    protected double h;
    Cyclinder(double r, double h){
        super(r);
        this.h = h;
    }
    public double volume(){
        return PI * r * r * h;
    }
}

public class ch17_2 {
    public static void main(String [] args){
        RectangleVolume rectangleVolume = new RectangleVolume(2, 3, 10);
        Cyclinder cyclinder = new Cyclinder(2, 10);
        System.out.println("矩形體積:" + rectangleVolume.volume());
        System.out.println("圓柱體積:" + cyclinder.volume());        
    }
}
