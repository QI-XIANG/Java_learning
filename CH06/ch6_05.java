package CH06;

public class ch6_05 {
    public static void main(String [] args){
        double weight = 50;
        double add = 1.2;
        for(int i=1; i<=10; i++){
            weight += add;
            System.out.printf("第 %d 年體重 : %.1f\n", i, weight);
        }
    }
}
