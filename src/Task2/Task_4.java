package Task2;

public class Task_4 {
    public static void main(String[] args) {

    }
    public static int[] cumulativeSum(int[] numbers){
        int[] newNumbers=new int[numbers.length];
        for (int i=0;i<numbers.length;i++){
            for (int j=0; j<i; j++){
                newNumbers[i]+=numbers[j];
            }
        }
        return newNumbers;
    }
}
