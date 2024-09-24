package CH06;

public class ch6_10 {
    public static void main(String [] args){
        //calculate euler number
        double e = 1;
        int n = 1;
        double item = 1;
        while(n <= 100){
            item = 1.0/factorial(n);
            e += item;
            if(n%10 == 0){
                System.out.printf("當 i = %d, e = %.14f\n", n, e);
            }
            n++;
        }
    } 
    
    public static double factorial(int n){
        double result = 1;
        for(int i=1; i<=n; i++){
            result *= i;
        }
        return result;
    }
}
