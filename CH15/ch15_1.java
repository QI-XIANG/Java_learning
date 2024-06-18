package CH15;

public class ch15_1 {
    public static void main(String [] args){
        String msg1 = "Qi-Xiang Zhang";
        int hd1 = msg1.hashCode();
        System.out.println("Qi-Xiang Zhang的hash code: " + hd1);
        String msg2 = msg1;
        int hd2 = msg2.hashCode();
        System.out.println("Qi-Xiang Zhang的hash code: " + hd2);
        String msg3 = "張棨翔";
        int hd3 = msg3.hashCode();
        System.out.println("張棨翔的hash code: " + hd3);
        String msg4 = new String("張棨翔");
        int hd4 = msg4.hashCode();
        System.out.println("張棨翔的hash code: " + hd4);
    }    
}
