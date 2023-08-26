package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(123,12,3,42,421,2);
//        System.out.println(list);
//        list.stream().map(x->x+10).forEach(System.out::println);
//        list.stream().filter(x->x%2==0).forEach(System.out::println);
//        list.stream().sorted().forEach(System.out::println);
        String s = " Hi ankush ankush how howare you you hi";
        Pattern p = Pattern.compile("\\s+");
        List<String> li = p.splitAsStream(s.trim()).
                map(String::valueOf).collect(Collectors.toList());
//        System.out.println(li);
        Map<String,Long> collect = li.stream()
                .collect( Collectors.groupingBy(
                        Function.identity(), Collectors.counting()));
        System.out.println(li.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(),Collectors.counting())).
                entrySet().stream()
                .filter(x->x.getValue()>1).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)));

        System.out.println(collect);





//        System.out.println(map);
//        System.out.println(list.stream().map(x->x+10).collect(Collectors.toList()));
    }
}
