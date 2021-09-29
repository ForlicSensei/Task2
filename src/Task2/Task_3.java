package Task2;

public class Task_3 {
    public static void main(String[] args) {

    }
    public static boolean isAvgWhole(int[] numbers){
        int Avg=0;
        for(int i=0;i<numbers.length; i++){
            Avg+=numbers[i];
        }
        return Avg % numbers.length == 0;
    }
}
