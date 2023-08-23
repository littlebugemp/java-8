package stream;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Convert String to Map based on the frequency count of word is greater than 1
 * input
 * String str = " Hi ankush ankush Future ankushFuture Hi you are youare good enough good enough Hi"
 * output
 * {ankush:2, Hi:3, good:2}
 * */

public class StringToMapBasedOnFrequency {
    public static void main(String[] args) {
        String str = " Hi ankush ankush Future ankushFuture Hi you are youare good enough good enough Hi";
        Pattern p = Pattern.compile("\\s+");
        List<String> list = p.splitAsStream(str.trim()).map(String::valueOf).toList();
        Map<String, Long> map = list.stream().collect(
                Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(x->x.getValue()>1)
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
        System.out.println(map);
    }
}
