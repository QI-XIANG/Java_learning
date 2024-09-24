package CH07;

public class ch7_03 {
    public static void main(String [] args){
        int [] arr = {1100, 652, 946, 821, 955, 1024, 1155};
        int sum = 0;
        double avg = 0;
        for(int num:arr){
            sum += num;
        }
        avg = (double) sum/arr.length;

        double var = 0;
        for(int num:arr){
            var += Math.pow((num-avg), 2);
        }
        var = var/arr.length;

        double std = Math.sqrt(var);
        
        System.out.printf("平均值 = %.2f\n", avg);
        System.out.printf("變異數 = %.2f\n", var);
        System.out.printf("標準差 = %.2f\n", std);
    }
}
