package CH15.ch15_6;

class Employee{
    String name;
    int age;
    String hometown;
    String country;

    public String toString(){
        return name + " 今年" + age + "歲 家鄉是" + hometown + " 國籍是" + country;
    }
}

public class ch15_6 {
    public static void main(String [] args){
        Employee A = new Employee();
        A.name = "John";
        A.age = 20;
        A.hometown = "杭州";
        A.country = "中國";
        System.out.println("列出物件 A : " + A.toString());
    }
}
