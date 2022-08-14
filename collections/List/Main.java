package List;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();

        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(60);
        liste.add(null);



        Iterator<Integer> itr = liste.iterator();

        /*while (itr.hasNext()){
            System.out.println(itr.next());
        }

        for (Integer element: liste //
             ) {
            System.out.println(element);
        } */

        System.out.println(liste.size()); // boyut
        System.out.println(liste.get(0)); // index numarasına göre sayıyı getiriyor
        System.out.println(liste.indexOf(60)); // sayının indexini getiriyor.
        liste.set(2,21); // set metodu ile index numarasını belirleyip değiştirme yapabiliriz.
        System.out.println(liste.get(2));
        System.out.println(liste.contains(21)); // array içerisinde arama işlemi yapabiliyoruz varsa true döndürüyor.

    }


}
