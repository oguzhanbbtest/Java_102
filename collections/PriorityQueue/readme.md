Priority Queue = Queue gibi fakat sıralamayı değiştirebiliyorsunuz.

Her zaman ki gibi PriorityQueue mizi kuralım:

    PriorityQueue<String> pque = new PriorityQueue<>();

Bir order sınıfı oluşturup comparator implements etmek yerine anonim sınıf oluşturalım farklı bir kullanım olarak

    
        PriorityQueue<String> pque = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

Görüldüğü gibi parantez içine new Comparator<String>() yazdığımız da otomatik metoduda override ediyor.

        
         PriorityQueue<String> pque = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

return olarak o1.compareTo(o2); metodumuzu kullanarak bir sıralama oluşturmuş olduk.

add ile veri ekleyip foreach döngümüzle bastırdık.

        pque.add("Oguzhan");
        pque.add("Bahadir");
        pque.add("Bayram");

        for (String s: pque
             ) {
            System.out.println(s);
        }