package University;
public class University {
    public static void main(String[] args) {
       Akademisyen rektör = new OgretimGorevlisi("Oguzhan Bahadir Bayram","05432","oguzhanbbtest@gmail.com","Mühendislik","Rektör","666"); //super
       Akademisyen ogretimGorevlisi = new OgretimGorevlisi("Mahmut Mahmudov","5454","mahmudov@","Fen Edebiyat","Prof","222"); // akademisyen sub
       Akademisyen asistan = new Asistan("Fatih Pembe","0522","fatihkcicek@","EEM","asistan","14.00-16.00");

       LabAsistanı labAsistanı = new LabAsistanı("Can Mor", "05421", "canm@", "EEM", "lbasistan", "15.00-16.00");

       Memur bilgiislemci = new BilgiIslem("Memur memurov","053432","memurmemur@","Ogrenci Isleri","09.00-17.00","bilgiislem"); // calisan sub
       Memur guvenlikGorevlisi = new GuvenlikGorevlisi("Hakan Haki","155","hakih@","GUVENLİK","08-18.00","ozelgüvenlik");
       Memur ogrenciisleri = new BilgiIslem("Fatma Sarı","05564","fatmasari@","ögrenciisleri","09.00-17.00","ogrenci kayıt");

       Calisan[] loginUsers = {ogretimGorevlisi,asistan,bilgiislemci,guvenlikGorevlisi};
       Calisan.girisYapanlar(loginUsers);

       ogretimGorevlisi.giris();
       ogretimGorevlisi.derseGir("14.00");
       asistan.derseGir("15.00");

       ogrenciisleri.yemekhane();
       ogrenciisleri.giris();










    }
}
