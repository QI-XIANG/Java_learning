package CH8;

class TaipeiBank{
    int account; // 定義帳戶
    int balance; // 定義餘額
    Boolean saveMoney(int save){ // 存款
        if(save > 0){
            balance += save; // 存款
            return true;
        }else{
            return false;
        }
    }
    Boolean withdraw_money(int withdraw){ // 提款
       if(withdraw > 0 && balance >= withdraw){
            balance -= withdraw; // 提款
            return true;
        }else{
            return false;
        }
    }
    void printInfo(){ // 列印帳戶資訊
        System.out.printf("帳戶: %d, 餘額: %d\n", account, balance);
    }
}

public class ch8_02 {
    public static void main(String [] args){
        TaipeiBank A = new TaipeiBank(); // 建立一個TaipeiBank物件
        A.account = 10000001; // 設定帳戶
        A.balance = 0; // 設定餘額

        A.printInfo(); // 列印帳戶資訊
        System.out.println("存款"+ (A.saveMoney(100)?"成功":"失敗")); // 存款
        A.printInfo(); // 列印帳戶資訊
        System.out.println("提款"+ (A.withdraw_money(90)?"成功":"失敗")); // 存款
        A.printInfo(); // 列印帳戶資訊
        System.out.println("提款"+ (A.withdraw_money(20)?"成功":"失敗")); // 存款
        A.printInfo(); // 列印帳戶資訊
    }    
}
