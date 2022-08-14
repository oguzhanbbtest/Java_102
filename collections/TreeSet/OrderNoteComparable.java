package TreeSet;

import java.util.Comparator;

public class OrderNoteComparable implements Comparator<Student> {


    @Override
    public int compare(Student o1, Student o2) {
        return o1.getNote() - o2.getNote(); // öğrencilerin notlarına göre bir sıralama yapıyor kücükten büyüğe
    }
}
