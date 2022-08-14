
Queuelinked list : ilk girenin ilk çıktığı bir linkedlist yöntemidir.

queue mizi kuruyoruz;
    
    Queue<String> q = new LinkedList<>();

Kuyruğumuza ekleme yapabiliyoruz
    
    q.add("Oguzhan");
    q.add("Bayram");

Bir iterator üretip while ile bastırabiliyoruz.
Iterator<String > itr = q.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

offer() ile ekleme yapılabiliyor. Kuyrugun sonuna ekliyor

    q.offer("Universite");

remove() Kuyruğun en başındakini siliyor.

    q.remove();

element() kuyruğun başındaki elemanı bize verir.

    System.out.println(q.element());