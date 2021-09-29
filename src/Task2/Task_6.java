package Task2;

public class Task_6 {
    public static void main(String[] args) {
        System.out.println(Fibonacci(12));
    }
    public static int Fibonacci(int n){
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        int [] fib=new int[n];
        fib[0]=1;
        fib[1]=2;
        for (int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[n-1];
    }
}
