package functional_interfaces;

import java.util.function.Function;

public class FunctionInterface implements Function<Integer, Double> {

    public static void main(String[] args) {
        //apply, andThen
        FunctionInterface fI = new FunctionInterface();
        System.out.println(fI.andThen(a->a*3).apply(5));
        System.out.println(fI.apply(5));


        Function<Integer,Integer> f = (a)->a/2;
        System.out.println(f.apply(24));

        //identity
        Function<Integer, Integer> f2 = Function.identity();
        System.out.println(f2.apply(23));
    }

    @Override
    public Double apply(Integer integer) {
        return integer/2.0;
    }

    @Override
    public <V> Function<V, Double> compose(Function<? super V, ? extends Integer> before) {
        return Function.super.compose(before);
    }

    @Override
    public <V> Function<Integer, V> andThen(Function<? super Double, ? extends V> after) {
        return Function.super.andThen(after);
    }
}
