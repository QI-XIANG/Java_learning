package CH12;

public class ch12_3 {
    public static void main(String args []){
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("原字串內容: " + str);
        str = str.replace("n", "m");
        str = str.replace("x", "y");
        System.out.println("新字串內容如下:\n" + str);
    }
}
