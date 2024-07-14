package CH8;

class Teacher{
    String school = "明志科大";
    String job = "老師";
    void work(){
        System.out.println("教書");
    }
    void printInfo(String course){
        System.out.println(school);
        System.out.println(job);
        work();
        System.out.println(course);
    }
}

public class ch8_07 {
    public static void main(String [] args){
        String course = "計算機概論";
        Teacher t1 = new Teacher();
        t1.printInfo(course);
    }
}
