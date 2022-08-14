package TreeSet;

import java.util.TreeSet;
/// DONT REPAET YOURSELF !!!
public class Main {

    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<>(new OrderNoteComparable()); // reversed ile tam tersi yapıyoruz.
        students.add(new Student("Oguzhan ",100)); // constrac içerdede kurabiliyorduk.
        students.add(new Student("Mahmud ",80));
        students.add(new Student("Fatih",70));
        students.add(new Student("Damla",90));

        for (Student stu: students) {
            System.out.println(stu.getName());
        }

    }
}
