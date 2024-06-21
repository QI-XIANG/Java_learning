package CH17.CH17_4;

interface Bird{
    void birdFly();
}

interface Airplane{
    void airplaneFly();
}

interface FlyingBall{
    void ballFly();
}

class Fly implements Bird, Airplane, FlyingBall{
    public void birdFly(){
        System.out.println("鳥用翅膀飛");
    }
    public void airplaneFly(){
        System.out.println("飛機用引擎飛");
    }
    public void ballFly(){
        System.out.println("飛行球用球飛");
    }
}

public class ch17_4 {
    public static void main(String [] args){
        Fly obj = new Fly();
        obj.birdFly();
        obj.airplaneFly();
        obj.ballFly();
    }
}
