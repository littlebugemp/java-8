package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreationType {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,2,45,53);
        Stream<Integer> stream1 = list.stream();
        stream1.forEach(System.out::println);

        //includes last index
        IntStream.rangeClosed(0,10).filter(x->x%2==0)
                .forEach(System.out::println);

        //range doesnt include first,last index
        IntStream.range(0,10).filter(x->x%2==0)
                .forEach(System.out::println);
        //distinct
        List<Integer> l = List.of(1,1,2,3,42,3,22,32,33,332,33);
        l.stream().distinct().forEach(System.out::print);
        //min function
        System.out.println(IntStream.range(0,10).min().getAsInt());
        //max function
        System.out.println(IntStream.range(0,10).max().getAsInt());
        //limit
        IntStream.range(0,10).limit(5).forEach(System.out::println);
        System.out.println("----------------------------------------");
        //skip
        IntStream.rangeClosed(0,10).skip(5).forEach(System.out::println);
    }
}
