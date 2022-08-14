package PriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {


        PriorityQueue<String> pque = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        pque.add("Oguzhan");
        pque.add("Bahadir");
        pque.add("Bayram");

        for (String s: pque
             ) {
            System.out.println(s);
        }
    }
}
