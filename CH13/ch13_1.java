package CH13;

public class ch13_1 {
    public static void main(String [] args){
        System.out.println("I love Java:是大陸手機號碼" + chinaPhone("I love Java"));
        System.out.println("0952-909-090是大陸手機號碼" + chinaPhone("0952-909-090"));
        System.out.println("134-3981-1391是大陸手機號碼" + chinaPhone("134-3981-1391"));
    }
    public static boolean chinaPhone(String str){
        if(str.length() != 13){
            return false;
        }
        for(int i = 0; i <= 2 ; i++){
            if(Character.isDigit(str.charAt(i)) == false){
                return false;
            }
        }
        if(str.charAt(3) != '-'){
            return false;
        }
        for(int i = 4; i<= 7; i++){
            if(Character.isDigit(str.charAt(i)) == false){
                return false;
            }
        }
        if(str.charAt(8) != '-'){
            return false;
        }
        for(int i = 9; i<= 12; i++){
            if(Character.isDigit(str.charAt(i)) == false){
                return false;
            }
        }
        return true;
    }
}
