package CH14.CH14_06;

class Car{
    private int maxSpeed;
    private String color;
    private String brand;
    private int year;
    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setYear(int year){
        this.year = year;
    }
    public void printCarInfo(){
        System.out.println("車輛品牌:" + brand + "\n車輛年份:" + year + "\n車子最高時速:" + maxSpeed + "\n車子外觀顏色:" + color);
    }
}

class Engine{
    public void starting(){
        System.out.println("引擎啟動");
    }
    public void running(){
        System.out.println("引擎運轉");
    }
    public void stopping(){
        System.out.println("引擎停止");
    }
}

class Sentra extends Car{
    public void SentraShow(){
        Engine sentraEngine = new Engine();
        sentraEngine.starting();
        sentraEngine.running();
        sentraEngine.stopping();
    }
}

public class ch14_06 {
    public static void main(String[] args){
        Sentra sentra = new Sentra();
        sentra.setBrand("BMW");
        sentra.setYear(2020);
        sentra.setMaxSpeed(220);
        sentra.setColor("藍色");
        sentra.printCarInfo();
        sentra.SentraShow();
    }
}
