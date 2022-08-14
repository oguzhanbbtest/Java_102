hashsetlerde ki gibi listimizi kuruyoruz

    List<Integer> liste = new ArrayList<>();

listemize ekleme yine .add(); metodumuzla

        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(60);
        liste.add(null);

Ekrana bastırmak için yine iterator kuruyoruz. ve while döngüsü ile ekranımıza bastırıyoruz.

    Iterator<Integer> itr = liste.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    
    // foreach ile de yapabiliriz:
    
    for (Integer element: liste) {
            System.out.println(element);
        }

Girdiğimiz sıra ile bastırabiliyoruz hiç bir problem yok. 
ctrl + metodun üstüne sağ tıklarsan arraylist dökümanını görebilir ve metotları inceleyebiliriz.

        System.out.println(liste.size()); // boyut
        System.out.println(liste.get(0)); // index numarasına göre sayıyı getiriyor
        System.out.println(liste.indexOf(60)); // sayının indexini getiriyor.
        liste.set(2,21); // set metodu ile index numarasını belirleyip değiştirme yapabiliriz.
        System.out.println(liste.get(2));
        System.out.println(liste.contains(21)); // array içerisinde arama işlemi yapabiliyoruz varsa true döndürüyor.

