package Task2;

public class Task_2 {
    public static void main(String[] args) {
    int [] numbers= new int[] {2,3,4,5};
        System.out.println((differentMaxMin(numbers)));
    }
    public static int differentMaxMin(int[] numbers){
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;
        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
            if (max < number) {
                max = number;
            }
        }
        return max-min;
    }
}
