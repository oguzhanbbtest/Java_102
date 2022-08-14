package HashMapLinked;

import HashMapTreeMap.OrderHM;
import TreeSet.Student;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, Student> students = new TreeMap<>(new OrderHM().reversed());

        students.put(102, new Student("Oguzhan",100));
        students.put(103, new Student("Pablo",100));
        students.put(104, new Student("Necmi",100));

        for (Student stu: students.values()) {
            System.out.println(stu.getName());
        }


    }
}
