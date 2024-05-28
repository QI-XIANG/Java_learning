package CH12;

public class ch12_4 {
    public static void main(String [] args){
        String str = "神雕俠侶是楊過與小龍女的故事，我喜歡小龍女在古墓的生活片段，小龍女清新脫俗美若天仙。";
        String [] str1 = str.split("小龍女");
        System.out.println("小龍女出現次數 = " + (str1.length - 1));
    }
}
