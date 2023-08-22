package lambdaexpressions;

import java.io.Serializable;
import java.rmi.Remote;

public class BlockLambda {

    interface Fun{
        int fact(int n);
    }

    public static void main(String[] args) {
        Fun fun = (n)->{
          //block body
            int res = 1;
            for(int i=1; i<=n;i++){
                res = i*res;
            }
            return res;
        };

        System.out.println(fun.fact(5));
    }

//    Remote

}
