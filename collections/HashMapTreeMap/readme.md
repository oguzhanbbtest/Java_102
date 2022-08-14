
Her zaman ki gibi map'imizi kuruyoruz

            Map<String,String> country = new HashMapTreeMap<>();

Ardından görüldüğü gibi 2 adet parametre girmeliyiz. 1.si key 2. çağırıcağımız veri

put() metodumuz bizim mapimizi oluşturmamızı sağlıyor.

            country.put("TR","TURKIYE");
            country.put("USA","AMERICA");

get() metodu ile parantez içersine mapimizin keyini girersek veriyi çağırmış oluruz.


         System.out.println(country.get("TR"));
         System.out.println(country.get("TR"));


foreach ile tüm verileri bastırabiliriz. sadece country nesnemizdee values() metodunu kullanmamız gerekiyor.

        for (String countryValues : country.values()
             ) {
            System.out.println(countryValues);
        }

replace() metodu ile eski veriyi degistirebiliyoruz.

            country.replace("USA","AMARACA");
