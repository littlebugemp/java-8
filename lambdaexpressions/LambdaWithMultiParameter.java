package lambda_expressions;

import java.util.Comparator;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaWithMultiParameter {
    public static void main(String[] args) {
        Func2Interface f1 = (int a,int b)->{
            System.out.println(a+b);
        };
        Func2Interface f2 = (int a, int b)->{
            System.out.println(a*b);
        };
        f1.abstractFun(3,5);
        f2.abstractFun(3,5);

        Fun1 add = (int a, int b)->a+b;
        Fun1 multi= (int a, int b)-> a*b;

        LambdaWithMultiParameter lambdaWithMultiParameter = new LambdaWithMultiParameter();
        int sum = lambdaWithMultiParameter.operate(4,5,add);
        System.out.println(sum);
    }
    interface Func2Interface{
        void abstractFun(int a, int b);
        default void normalFun(){
            System.out.println("I am a Normal Function");
        }
    }

    interface Fun1{
        int operation(int a, int b);
    }

    interface Fun2{
        void sayMessage(String message);
    }

    private int operate(int a, int b, Fun1 fun1){
        return fun1.operation(a,b);
    }



}
