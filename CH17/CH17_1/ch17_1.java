package CH17.CH17_1;

interface Fly{
    void flying();
}

class Bird implements Fly{
    public void flying(){
        System.out.println("鳥在飛行");
    }
}

class Airplane implements Fly{
    public void flying(){
        System.out.println("飛機在飛行");
    }
}

class Eagle implements Fly{
    public void flying(){
        System.out.println("老鷹在飛行");
    }
}

public class ch17_1 {
    public static void main(String [] args){
        Fly bird = new Bird();
        Fly airplane = new Airplane();
        Fly eagle = new Eagle();
        bird.flying();
        airplane.flying();
        eagle.flying();
    }
}
