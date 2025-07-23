package ACP;

import java.util.function.Predicate;

public class lambda51 {
    public static void main(String[] args) {
        int[] arr = {20,34,56,43,21,-1,-89};
    Predicate<Integer> p1 = (i)->(i%2==0);
    Predicate<Integer> p2 = (j)->(j>0);

    for(int n:arr){
        if(p1.test(n)){
            System.out.println(n);
        }
    }

    }
}

