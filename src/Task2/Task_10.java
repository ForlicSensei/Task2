package Task2;

import java.lang.reflect.Field;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
        System.out.println(boxSeq(3));
        System.out.println(boxSeq(4));
        System.out.println(boxSeq(6));
    }
    public static int boxSeq(int step){
        int Fields=0;
        for(int i=1; i<=step;i++){
            if (i %2 !=0)
                Fields+=3;
            else
                Fields-=1;
        }
        return Fields;
    }
}
