package functional_interfaces;

import java.util.function.Predicate;

/*
* implement chaining to check if number is greater than 5 and less than 10 return true
* */

public class PredicateChaining {
    public static void main(String[] args) {
        Predicate<Integer> greater = (s)->s>5;
        Predicate<Integer> smaller = (s)->s<10;
        boolean result1 = greater.and(smaller).test(4);
        boolean result2 = greater.and(smaller).test(8);
        System.out.println(result1);
        System.out.println(result2);

        //negate
        boolean result3 = greater.and(smaller).negate().test(19);
        System.out.println(result3);
    }
}
