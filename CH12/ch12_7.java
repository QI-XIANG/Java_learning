package CH12;

public class ch12_7 {
    public static void main(String [] args){
        String [] str = {"ch1_1.docx", "ch1_2.c", "ch2_1.java", "ch2_2.pptx", "ch3_1.c", "ch3_2.java"};
        System.out.println("ch1開頭的檔案");
        for(int i = 0; i < str.length; i++){
            if(str[i].startsWith("ch1")){
                System.out.println(str[i]);
            }
        }
        System.out.println("c語言檔案");
        for(int i = 0; i < str.length; i++){
            if(str[i].endsWith("c")){
                System.out.println(str[i]);
            }
        }
    }
}
