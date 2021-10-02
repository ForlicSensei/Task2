package Task2;

import java.util.stream.Stream;

public class Task_9 {
    public static void main(String[] args) {
        System.out.println(isPrefix("automation","-auto"));
        System.out.println(isSuffix("arachnophobia","phobia-"));
    }
    public static boolean isPrefix(String word,String prefix){
        return Stream.of(prefix.replace("-","")).anyMatch(word ::startsWith);
    }
    public static boolean isSuffix(String word,String suffix){
        return Stream.of(suffix.replace("-","")).anyMatch(word ::endsWith);
    }
}
