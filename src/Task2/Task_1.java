package Task2;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class Task_1 {
    public static void main(String[] args) {
        repeat("Хай",2);
    }
    public static void repeat(String s,int n){
        char [] myCharArray = s.toCharArray();
        for (int i=0; i<myCharArray.length;i++) {
            for (int j = 0; j < n; j++)
                System.out.print(myCharArray[i]);
        }
    }
}
