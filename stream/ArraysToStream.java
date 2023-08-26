package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArraysToStream {
    public static void main(String[] args) {
        String[] arr = {"Apple","Mango","Peach"};
        Stream<String> stream = Arrays.stream(arr);
        stream.filter(x->x.startsWith("A")).forEach(System.out::println);
    }
}
