package CH12;

public class ch12_6 {
    public static void main(String [] args){
        String str1 = "java";
        String str2 = "Java";
        System.out.println("compareTo結果 = " + ((str1.compareTo(str2)) == 0 ? true : false));
        System.out.println("compareToIgnoreCase結果 = " + ((str1.compareToIgnoreCase(str2)) == 0 ? true : false));
        System.out.println("equals結果 = " + str1.equals(str2));
        System.out.println("equalsIgnoreCase結果 = " + str1.equalsIgnoreCase(str2));
    }
}
