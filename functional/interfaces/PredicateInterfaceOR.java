package functional.interfaces;

/**
* if string has character a in it or have length 10
* */

import java.util.function.Predicate;

public class PredicateInterfaceOR {
    public static void main(String[] args) {
        Predicate<String> contains = (s)->s.contains("a");
        Predicate<String> hasLength= (s)->s.length()>=10;

        boolean str1= contains.or(hasLength).test("iamarobot");
        boolean str2= contains.or(hasLength).test("jhonwick");
        System.out.println(str1);
        System.out.println(str2);
    }
}
