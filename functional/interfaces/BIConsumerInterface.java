package functional.interfaces;

import java.util.function.BiConsumer;

public class BIConsumerInterface implements BiConsumer<Integer,Integer> {
    public static void main(String[] args) {
        BIConsumerInterface bi = new BIConsumerInterface();
        bi.accept(1,2);

        BiConsumer<String, String> biConsumer = (s1,s2)->{
          if(s1.equals(s2)){
              System.out.println("Same String");
          }else{
              System.out.println("Different");
          }
        };
        biConsumer.accept("ankush","ankush");
        biConsumer.accept("ankush","Ankush");
    }

    @Override
    public void accept(Integer integer, Integer integer2) {
        if(integer>integer2){
            System.out.println("Number 1 is Greater Then Number 2");
        }else if(integer2>integer){
            System.out.println("Number 2 is Greater Then Number 1");
        }else{
            System.out.println("Number 1 is Equal Number 2");
        }
    }

    @Override
    public BiConsumer<Integer, Integer> andThen(BiConsumer<? super Integer, ? super Integer> after) {
        return BiConsumer.super.andThen(after);
    }
}
