package functional.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// A simple program to demonstrate the use
// of predicate interface
public class PredicateInterface implements Predicate<Integer> {
    public static void main(String[] args) {
        // create a list of strings
        List<String> names = Arrays.asList(
                "Geek", "GeeksQuiz", "g1", "QA", "Geek2");
        Predicate<String> predicate = (s)->s.startsWith("G");
        for(String name:names){
            System.out.println(predicate.test(name));
        }
        PredicateInterface p = new PredicateInterface();
        p.test(3);
    }

    @Override
    public boolean test(Integer integer) {
        return false;
    }
}
