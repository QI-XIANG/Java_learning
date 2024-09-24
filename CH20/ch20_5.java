package CH20;

public class ch20_5 {

    public static void checkAge(int age) {
        if(age < 18) {
            System.out.printf("%d歲的年齡太輕\n", age);
            throw new StringIndexOutOfBoundsException("年齡不符規定");
        }else{
            System.out.printf("%d歲的年齡歡迎投票\n", age);
        }
    }

    public static void main(String [] args) {
        int age [] = {12, 19, 67};

        for(int i = 0; i < age.length; i++) {
            try{
                checkAge(age[i]);
            }catch(StringIndexOutOfBoundsException e) {
                System.out.println("Error! " + e);
                e.printStackTrace();
            }
        }

        System.out.println("測試年齡愉快");
    }
}
