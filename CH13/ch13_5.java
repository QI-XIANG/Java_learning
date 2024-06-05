package CH13;

import java.util.regex.*;

public class ch13_5 {
    public static void main(String [] args){
        String msg = "CIA Mark told CIA Linda that secret USB had given to CIA Peter.";
        String pattern = "CIA \\w*";
        String replace = "***";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(msg);
        System.out.println(m.replaceFirst(replace));
        System.out.println(m.replaceAll(replace));
    }
    
}
