package Task2;

public class Task_7 {
    public static void main(String[] args) {
        System.out.println(isValid("55555"));
    }
    public static boolean isValid(String s){
    return (s.length() == 5) && s.matches("[\\d]+");
    }
}
