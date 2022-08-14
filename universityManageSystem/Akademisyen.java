package University;
public abstract class Akademisyen extends Calisan{
    private String bolum;
    private String unvan;

    public Akademisyen(String adSoyad, String telefon, String eposta, String bolum, String unvan) {
        super(adSoyad, telefon, eposta);
        this.bolum = bolum;
        this.unvan = unvan;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    @Override
    public void giris(){
        System.out.println(this.getAdSoyad() + " akademisyeni A kapisindan giris yapti..");
    }

    @Override
    public void cikis(){
        System.out.println(this.getAdSoyad() + " akademisyeni A kapisindan cikis yapti..");
    }

    @Override
    public void yemekhane() {
        System.out.println(this.getAdSoyad() + " yemek yedi ..");
    }
    public abstract void derseGir(String dersSaati); // abstrack metot'un body'si olmaz kod bloğu açamazsın ; ile kapa

}
