package lambda_expressions;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaWith1Parameter {
    public static void main(String[] args) {
        FuncInterface funcInterface = (int s)->{
            System.out.println(s*s);
        };
        funcInterface.abstractFun(5);
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        arrL.forEach(x-> System.out.println(x));

    }
    interface FuncInterface{
        void abstractFun(int x);
        default void normalFun(){
            System.out.println("I am Normal Function");
        }
    }
}
