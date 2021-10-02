package Task2;

public class Task_8 {
    public static void main(String[] args) {
        System.out.println(isStrangePair("sparkling", "groups"));
    }
    public static boolean isStrangePair(String s1,String s2){
        return s1.toLowerCase().charAt(0) == s2.toLowerCase().charAt(s2.length()-1) && s2.toLowerCase().charAt(0) == s1.toLowerCase().charAt(s1.length()-1);
    }
}
