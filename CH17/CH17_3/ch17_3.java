package CH17.CH17_3;

interface Vehicle{
    String getBrand();
    String run();
    default String alarmOn(){
        return "開啟警告燈";
    }
    default String alarmOff(){
        return "關閉警告燈";
    }
    default String starting(){
        return "車輛啟動系統檢查中...";
    }
    default String ending(){
        return "車輛停駐完成，車輛保全啟動中...";
    }
}

class Car implements Vehicle{
    private String brand;
    Car(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public String run(){
        return "安全駕駛中...";
    }
}

public class ch17_3 {
    public static void main(String [] args){
        Vehicle car = new Car("Toyota");
        System.out.println(car.getBrand());
        System.out.println(car.run());
        System.out.println(car.alarmOn());
        System.out.println(car.alarmOff());
        System.out.println(car.starting());
        System.out.println(car.ending());
    }
}
