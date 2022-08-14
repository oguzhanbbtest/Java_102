package HashMapTreeMap;

import java.util.Comparator;

public class OrderHM implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }
}
