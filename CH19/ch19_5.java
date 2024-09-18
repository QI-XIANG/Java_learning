package CH19;

import CH19.animals.*;

public class ch19_5 {
    
    public static void main(String args []){
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.travel();
        dog.run();
        dog.sleep();
        
        cat.eat();
        cat.travel();
        cat.run();
        cat.sleep();
        
    }
    
}
