package Task2;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println(getDecimaPlaces("10.20000"));
    }
    public static int getDecimaPlaces(String s){
        char[] ch=s.substring(s.indexOf(".")).toCharArray();
        return ch.length-1;
    }
}
