package functional.interfaces;

public class Example2 {
    interface Calculator{
        int run(int a,int b);
    }

    public static void main(String[] args) {
        Calculator add  = (a,b)->a+b;
        Calculator multi= (a,b)->a*b;
        System.out.println(add.run(3,2));
        System.out.println(multi.run(1,3));
    }
}
