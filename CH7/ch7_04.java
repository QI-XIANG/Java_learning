package CH7;

public class ch7_04 {
    public static void main(String [] args){
        int [] h_temp = {30, 28, 29, 31, 33, 35, 32};
        int [] l_temp = {20, 21, 19, 22, 23, 24, 20};
        
        //find the highest temperature
        int max_temp = h_temp[0];
        for(int temp:h_temp){
            if(temp > max_temp){
                max_temp = temp;
            }
        }
        
        System.out.printf("最高溫 : %.1f\n", (double) max_temp);

        //find the lowest temperature
        int min_temp = l_temp[0];
        for(int temp:l_temp){
            if(temp < min_temp){
                min_temp = temp;
            }
        }

        System.out.printf("最低溫 : %.1f\n", (double) min_temp);

        //find the average temperature
        System.out.printf("每天平均溫度 : ");
        for(int i=0; i<h_temp.length; i++){
            System.out.printf("%.2f ", (double) (h_temp[i]+l_temp[i])/2);
        }

    }
}
