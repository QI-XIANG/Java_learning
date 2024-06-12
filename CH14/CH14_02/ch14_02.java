package CH14.CH14_02;

class Animal{
    protected String name;
    protected String id;
    Animal(String name, String id){
        this.name = name;
        this.id = id;
    }
    public void eat(){
        System.out.println("編號" + id + ":" + name + "正在吃食物");
    }
}

class Mammal extends Animal{
    protected String favorite_food;
    Mammal(String name, String favorite_food, String id){
        super(name, id);
        this.favorite_food = favorite_food;
    }
    public void favoriteFood(){
        System.out.println("編號" + id + ":" + name + "喜歡吃" + favorite_food);
    }
}

class Cat extends Mammal{
    Cat(String name, String favorite_food, String id){
        super(name, favorite_food, id);
    }
    public void jumping(){
        System.out.println("編號" + id + ":" + name + "正在跳");
    }
}

public class ch14_02 {
    public static void main(String [] args){
        Cat cat = new Cat("lucy","fish", "001");
        cat.eat();
        cat.favoriteFood();
        cat.jumping();
    }
}
