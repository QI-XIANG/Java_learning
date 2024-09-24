package CH09;

class TaipeiBank{
    private String name;
    private int balance;
    private int rate = 30;
    private double service_charge = 0.01;
    public TaipeiBank(String name){
        this.name = name;
        this.balance = 0;
    }
    public void saveMoney(int money){
        this.balance += money;
        System.out.println("當存款是 " + balance);
    }
    public void withdrawMoney(int money){
        this.balance -= money;
    }
    public double usa_to_taiwan(int usaD){
        if(this.balance >= 10000){
            this.service_charge = 0.008;
        }
        return cal_rate(usaD);
    }
    public double taiwan_to_usa(int taiD){
        if(this.balance >= 10000){
            this.service_charge = 0.008;
        }
        return cal_tw_rate(taiD);
    }
    private double cal_tw_rate(int taiD){
        double result;
        result = (taiD / 30) * (1 - service_charge);
        return result;
    }
    private double cal_rate(int usaD){
        double result;
        result = usaD * rate * (1 - service_charge);
        return result;
    }
    public void get_balance(){
        System.out.println(name + "，目前存款餘額 : " + balance);
    }
}

public class ch9_2 {
    public static void main(String [] args){
        TaipeiBank A = new TaipeiBank("Hung");
        int twiD = 30000;
        A.saveMoney(5000);
        System.out.println(twiD + " 台幣可以兌換 " + A.taiwan_to_usa(twiD) + " 美金");
        A.saveMoney(10000);
        System.out.println(twiD + " 台幣可以兌換 " + A.taiwan_to_usa(twiD) + " 美金");
    }
}
