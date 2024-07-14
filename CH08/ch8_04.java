package CH8;

public class ch8_04 {
    public static void main(String [] args){
        System.out.println("總和   = " + add(new int[]{1,2,3,4,5}));
        System.out.println("最大值 = " + findMax(new int[]{1,2,3,4,5}));
        System.out.println("最小值 = " + findMin(new int[]{1,2,3,4,5}));
    }
    public static int add(int [] nums){
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        return sum;
    }
    public static int findMax(int [] nums){
        int max = nums[0];
        for(int num:nums){
            if(num > max){
                max = num;
            }
        }
        return max;
    }
    public static int findMin(int [] nums){
        int min = nums[0];
        for(int num:nums){
            if(num < min){
                min = num;
            }
        }
        return min;
    }
}
