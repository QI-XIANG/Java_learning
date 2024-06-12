package CH14.CH14_01;

class Animal{
    protected String name;
    protected String id;
    protected int age;
    public void eat(){
        System.out.println(name + "編號" + id + "今年" + age + "歲正在吃食物");
    }
    public void sleep(){
        System.out.println(name + "編號" + id + "今年" + age + "歲正在睡覺");
    }
}
class Dog extends Animal{
    public Dog(String name, String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public void barking(){
        System.out.println(name + "正在叫");
    }
}
class Bird extends Animal{
    public Bird(String name, String id, int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public void flying(){
        System.out.println(name + "正在飛");
    }
}

public class ch14_01 {
    public static void main(String [] args){
        Dog dog = new Dog("Haly","001",5);
        dog.eat();
        dog.sleep();
        dog.barking();
        Bird bird = new Bird("Cici","002",3);
        bird.eat();
        bird.sleep();
        bird.flying();
    }
    
}
