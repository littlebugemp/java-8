package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapVsMap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,2);
        list.stream().map(x->x*x)
                .forEach(System.out::println);
        List<List<Integer>> list2 = new ArrayList<>();
        list2.add(Arrays.asList(1,2,4));
        list2.add(Arrays.asList(2,3,4));
        list2.add(Arrays.asList(3,4,5));

       List<Integer> list3 = list2.stream().
               flatMap(
                l->l.stream()).collect(Collectors.toList());
        System.out.println(list3);
    }
}
