package CH06;

public class ch6_09 {
    public static void main(String [] args){
        int count = 0;
        for(int i = 2; i <= 20; i++){
            count = 0;
            for(int j = 1; j <= i; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.printf("%d\n", i);
            }
        }
    }    
}
