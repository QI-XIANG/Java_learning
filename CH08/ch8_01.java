package CH08;

class Dog{
    String name; // 定義狗的名字
    String color; // 定義狗的顏色
    int age; // 定義狗的年齡
    void barking(){ // 定義狗叫的方法
        System.out.println("我的狗在叫"); 
    }
    void eating(){ // 定義狗吃的方法
        System.out.println("我的狗在吃東西");
    } 
}

public class ch8_01 {
    public static void main(String [] args){
        Dog myDog = new Dog(); // 建立一個Dog物件
        myDog.name = "Lily"; // 設定狗的名字
        myDog.color = "白色"; // 設定狗的顏色
        myDog.age = 5; // 設定狗的年齡
        
        System.out.println("我的狗名字是 : " + myDog.name);
        System.out.println("我的狗顏色是 : " + myDog.color);
        System.out.println("我的狗年齡是 : " + myDog.age);

        myDog.barking(); // 呼叫Dog物件的barking方法
        myDog.eating(); // 呼叫Dog物件的eating方法
    }
}
