LinkedHashSet: hash set ile aynı fakat yazılan sıra ile sıralayabiliyor verileri..

LinkendHashSetimizi kuruyoruz :

    LinkedHashSet<Integer> lSet = new LinkedHashSet<>();

Verilerimizi ekliyoruz

    lSet.add(10);
    lSet.add(20);
    lSet.add(30);

Bir iterator üretiyoruz. ve while döngümüz ile bastırıyoruz. görüldüğü gibi yazılan sıra ile çıktı alıyoruz.

    Iterator<Integer> itr = lSet.iterator();
    
    while (itr.hasNext()){
       System.out.println(itr.next());
    }