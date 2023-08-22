package functional_interfaces;

import java.util.function.Supplier;

public class SupplierInterface {
    public static void main(String[] args) {
        Supplier<Double> a = ()->Math.random();
        System.out.println(a.get());
    }
}
