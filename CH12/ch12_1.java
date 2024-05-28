package CH12;

public class ch12_1 {
    public static void main(String [] args){
        char [] str = {'M','i','n','g','-','C','h','i',' ','I','n','s','t','i','t','u','t','e',' ', 'o','f',' ','T','e','c','h','n','o','l','o','g','y'};
        String str1 = new String(str);
        System.out.println("學校英文名稱字串長度 = " + str1.length());
        System.out.println("學校英文明成轉換大寫 = " + str1.toUpperCase());
    }
}
