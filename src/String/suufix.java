package String;

public class suufix {
    public static void main(String[] args) {
        String words ="apple";
        for(int i=0;i<=words.length();i++){
           // String suffix =words.substring(0,i);
            String suffix =words.substring(0,i);
            System.out.println(suffix);
        }
    }
}
