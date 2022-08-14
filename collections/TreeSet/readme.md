
TreeSet: TreeSet<sınıfAdı> sınıfNesnesi = new TreeSet<>(sıralamaMetodu);
şeklinde bir tree set oluşturabiliyoruz.

sıralamak istediğimiz nesnenin sınıfını oluşturarak işe başlayabiliriz.

    public class Student
        private string name;
        private int note;
    
    contstructorlarını ve setter getterlarını kuruyoruz...

Sınıfımızı oluşturduktan sonra..

    TreeSet<Student> students = new TreeSet<>(); 
    students.add(new Student(name,note)); 

Bunları sıralamk istediğimizde hata alıcaz çünkü sıralama yöntemini metodunu oluştumadık
bunun için bir sıralama sınıfı kuruyoruz ve Comparator sınıfını implement ediyoruz.

    public class OrderNoteComp implements Comparator<Student> { 
         @Override
    public int compare(Student o1, Student o2) {
        return o1.getNote() - o2.getNote(); 
    
    {

İmplement ettiğimiz sınıfın metodunu override etmemiz gerekiyor ve aslında bu noktada override edilen metodun return'üne yazdığımız ifade ile sıralama yöntemini belirlemiş olduk.
    
    public int compare(Student o1, Student o2) {
    return o1.getNote() - o2.getNote();
    {

aynı şeyi diğer nitelik içinde yapabiliriz bunun için yine sıralama sınıfı oluşturalım
    
    public class OrderNameComp implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName()); // javanın hazır compareTo(); metodu ile karşılaltırabiliyoruz.
    }
}


Şimdi sıralama sınıflarımızıda oluştuduğumuza göre override edilmiş metotlarımızı sıralama yapmak için kullanamabiliriz.

    TreeSet<Student> students = new TreeSet<>(new OrderNameComp()); 
    Görüldiği gibi newTreeSet(sıralamametodumuzuiçineyazıyoruz());

Foreach döngümüz ile sıralamamızı yapabiliriz artık

    for (Student stu: students) {
    System.out.println(stu.getName());
    }

İsim sırasına göre Çıktı:

    Damla
    Fatih
    Mahmud
    Oguzhan

    Process finished with exit code 0


    