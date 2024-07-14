package CH7;

public class ch7_02 {
    public static void main(String [] args){
        int arr [] = {23, 99, 38, 9, 10, 22, 87, 25, 77};
        for(int i=0; i < arr.length; i++){
            for(int j=i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.printf("最大值: %d\n", arr[arr.length-1]);
        System.out.printf("最小值: %d\n", arr[0]);
        System.out.printf("中間值: %d\n", arr[(int)arr.length/2]);
    }    
}
