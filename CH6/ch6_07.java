package CH6;

public class ch6_07 {
    public static void main(String [] args){
        for(int i = 1; i <= 9; i++){
            for(int j = 9; j >= i; j--){
                System.out.printf("%d", j);
            }
            System.out.println();
        }
    }    
}
