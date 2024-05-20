package CH10;

public class ch10_7 {
    public static void main(String [] args){
        
        double r = 6371;
       
        
        double x1 = 39.9196;
        double y1 = 116.3669;
      
        double x2 = 48.8595;
        double y2 = 2.3369;
       
        double d;
        d = r * Math.acos(Math.sin(Math.toRadians(x1))*Math.sin(Math.toRadians(x2)) + 
        Math.cos(Math.toRadians(x1))*Math.cos(Math.toRadians(x2))*
        Math.cos(Math.toRadians(y1-y2)));

        System.out.println("distance = " + d);
    }
}
