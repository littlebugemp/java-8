package lambda_expressions;

public class LambdaWithZeroParameter {
    public static void main(String[] args) {
        FunInterface funInterface = ()->{
            System.out.println("I am lambda expression");
        };
        funInterface.abstractFun();
    }
    interface FunInterface{
        void abstractFun();
        default void normalFun(){
            System.out.println("I am normal function");
        }
    }
}
