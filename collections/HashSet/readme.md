HashSet : 

hashsetimizi kuruyoruz, HashSet<Wrap Sınıf (veri tipimizi yazıyoruz)>...
    
    HashSet<Integer> hSet = new HashSet<>();

oluşturulan hSet nesnemize .add(); metodu ile istediğimiz parametreyi ekleyebiliyoruz.

    hSet.add(10);
    hSet.add(20);
    hSet.add(30);

peki bunu nasıl çıktı alıcaz, foreach ile bastırabiliriz buda bir yöntem.

    for (Integer sayi: hSet) { // h.Set bastırma foreach yöntemi
    System.out.println(sayi);
    }
    hSet.remove(10);
    System.out.println(hSet.size());

yada Iterator kurup daha kolay bir yöntemle bastırabiliriz

    Iterator<Integer> itr = hSet.iterator();

Ve while ile döngümüzü kurabiliriz

    while (itr.hasNext()){ // h.Set bastırma itera yöntemi
    System.out.println(itr.next());
    }

Kurduğumuz döngüde başlangıç hash "i" oldugunu var sayarsak .hasNext() metodu kendinden sonra bir eleman varmı kontrol edip true gönderiyor bir boolean fonksiyondur.
.next() metoduda kendisinden sonraki veriyi getiriyor. ve bu şekilde pratik bir while döngüsü ile hast setlerimizi bastırabiliyoruz.