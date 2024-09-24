package CH07;

public class ch7_01 {
    public static void main(String [] args){
        int arr [] = {23, 33, 43, 53, 63, 73};
        int sum = 0;
        double avg = 0;
        for(int x:arr){
            sum += x;
        }
        System.out.print("相反順序輸出 : ");
        for(int i=arr.length-1; i>=0; i--){
            System.out.printf("%d ", arr[i]);
        }
        avg = (double)sum/arr.length;
        System.out.println();
        System.out.printf("總和 = %d\n", sum);
        System.out.printf("平均 = %.1f\n", avg);
    }
}
