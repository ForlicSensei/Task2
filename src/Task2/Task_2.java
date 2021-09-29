package Task2;

public class Task_2 {
    public static void main(String[] args) {
    int [] numbers= new int[] {2,3,4,5};
        differentMaxMin(numbers);
    }
    public static int differentMaxMin(int[] numbers){
        int max=Integer.MAX_VALUE, min=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length;i++){
            if(min > numbers[i]){
                min=numbers[i];
            }
            if(max < numbers[i]){
                max=numbers[i];
            }
        }
        return max-min;
    }
}
