package CH15;

public class ch15_2 {
    public static void main(String args []){
        String msg1 = "Qi-Xiang Zhang";
        int hd1 = msg1.hashCode();
        System.out.println("String類別Qi-Xiang Zhang的hash code : " + hd1);
        StringBuilder msg2 = new StringBuilder(msg1);
        int hd2 = msg2.hashCode();
        System.out.println("Object類別Qi-Xiang Zhang的hash code : " + hd2);
        String msg3 = "張棨翔";
        int hd3 = msg3.hashCode();
        System.out.println("String類別張棨翔的hash code : " + hd3);
        StringBuilder msg4 = new StringBuilder(msg3);
        int hd4 = msg4.hashCode();
        System.out.println("Object類別張棨翔的hash code : " + hd4);
    }
}
