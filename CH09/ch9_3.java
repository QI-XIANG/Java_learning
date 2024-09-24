package CH09;

class DemoConstructor{
    int age;
    String name;
    DemoConstructor(){
        this.name = "John";
        this.age = 20;
    }
    DemoConstructor(String name, int age){
        this.age = age;
        this.name = name;
    }
}


public class ch9_3 {
    public static void main(String [] args){
        DemoConstructor c1 = new DemoConstructor();
        DemoConstructor c2 = new DemoConstructor("Peter", 22);
        System.out.println(c1.name + " " + c1.age);
        System.out.println(c2.name + " " + c2.age);
    }
}
