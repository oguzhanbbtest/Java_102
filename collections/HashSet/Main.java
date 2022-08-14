package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> hSet = new HashSet<>();
        hSet.add(10);
        hSet.add(20);
        hSet.add(30);

        for (Integer sayi: hSet) { // h.Set bastırma foreach yöntemi
            System.out.println(sayi);
        }
        hSet.remove(10);
        System.out.println(hSet.size());
        // hSet.clear();

        Iterator<Integer> itr = hSet.iterator();

        while (itr.hasNext()){ // h.Set bastırma itera yöntemi
            System.out.println(itr.next());
        }
    }
}
