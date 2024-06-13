package CH14.CH14_03;

class Animal{
    protected String name;
    public void eat(){
        System.out.println(name + "正在吃食物");
    }
    public void sleep(){
        System.out.println(name + "正在睡覺");
    }
}

public class ch14_03 extends Animal{
    ch14_03(String name){
        this.name = name;
    }
    public void barking(){
        System.out.println(name + "正在叫");
    }
    public static void main(String [] args){
        ch14_03 dog = new ch14_03("Haly");
        dog.eat();
        dog.sleep();
        dog.barking();
    }
}
