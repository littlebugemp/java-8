package stream;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,23,42,52,5);
        //using sequential stream
        list.stream().forEach(System.out::println);
        //using parallel stream
        list.parallelStream().forEach(System.out::println);
        //make each element in parallel stream order
        list.parallelStream().forEachOrdered(System.out::println);
    }
}
