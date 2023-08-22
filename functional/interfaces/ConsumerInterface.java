package functional.interfaces;

import java.util.function.Consumer;

public class ConsumerInterface implements Consumer<String> {

    public static void main(String[] args) {
        ConsumerInterface ci = new ConsumerInterface();
        ci.accept("Ankush");

        Consumer<Integer> i = (number)-> System.out.println("Given Number is "+number);
        i.accept(15);
    }

    @Override
    public void accept(String s) {
        System.out.println(s);
    }

    @Override
    public Consumer<String> andThen(Consumer<? super String> after) {
        return Consumer.super.andThen(after);
    }
}
