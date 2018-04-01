package Task23;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class ArraysOfNumbers {

    TreeSet x = new TreeSet();
    TreeSet y = new TreeSet();

    private void fillarrays () {
        int a = 9;
        while (a > 0){
            x.add((int)(Math.random()*1000));
            y.add((int)(Math.random()*1000));
            a--;
        }
    }

    public void crossNumbers () {
      fillarrays();
        x.add(8);
        x.add(10);
        y.add(10);
        y.add(99);

        System.out.println(x);
        System.out.println(y);
      x.retainAll(y);
        System.out.println(x);

    }

}
