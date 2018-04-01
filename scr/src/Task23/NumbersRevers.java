package Task23;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class NumbersRevers {

    public static void numberReverse(int x){

        System.out.println(x);

        Queue list = new LinkedList();
        while (x>0){
            list.add(x%10);
            x/=10;
        }

        while (!list.isEmpty()){
            System.out.print(list.poll());
        }

    }

}