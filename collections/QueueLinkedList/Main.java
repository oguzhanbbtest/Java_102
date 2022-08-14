package QueueLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.add("Oguzhan");
        q.add("Bayram");
        q.add("Karabuk");

        q.offer("Universite");

        q.remove();

        Iterator<String > itr = q.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println(q.element());

    }
}
