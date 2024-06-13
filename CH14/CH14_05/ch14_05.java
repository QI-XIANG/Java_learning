package CH14.CH14_05;

class HomeTown{
    protected String city, state, country, street;
    protected int Num;
    HomeTown(String city, String state, String country, String street, int Num){
        this.city = city;
        this.state = state;
        this.country = country;
        this.street = street;
        this.Num = Num;
    }
}

class Employee{
    int id;
    int age;
    char gender;
    String name;
    int salary;
    HomeTown homeTown;
    Employee(int id, int age, char gender, String name, HomeTown homeTown, int salary){
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.homeTown = homeTown;
        this.salary = salary;
    }
    public void printInfo(){
        System.out.println("員工編號:" + id + "\t" +
                           "員工年齡:" + age + "\t" +
                           "員工薪資:" + salary + "\t" +
                           "員工性別:" + gender + "\t" +
                           "員工姓名:" + name);
        System.out.println("號碼:" + homeTown.Num + "\t" +
                            "街道:" + homeTown.street + "\t" +
                            "城市:" + homeTown.city + "\t" +
                            "省份:" + homeTown.state + "\t" +
                            "國別:" + homeTown.country);    
    }
}

public class ch14_05 {
    public static void main(String[] args){
        HomeTown homeTown = new HomeTown("台北市", "台灣", "中山北路", "100", 1);
        Employee employee = new Employee(1, 25, 'M', "John", homeTown, 30000);
        employee.printInfo();
        HomeTown homeTown2 = new HomeTown("台中市", "台灣", "中山南路", "200", 2);
        Employee employee2 = new Employee(2, 30, 'F', "Mary", homeTown2, 40000);
        employee2.printInfo();
        HomeTown homeTown3 = new HomeTown("高雄市", "台灣", "中山東路", "300", 3);
        Employee employee3 = new Employee(3, 35, 'M', "Tom", homeTown3, 50000);
        employee3.printInfo();
    }
}
