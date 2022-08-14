package University;

public class BilgiIslem extends Memur{
    private String gorev;

    public BilgiIslem(String adSoyad, String telefon, String eposta, String departman, String mesai, String gorev) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public  void networkKurulumu(){
        System.out.println(getAdSoyad()+" "+getDepartman()+" departmanina network kurdu");
    }

    @Override
    public void calis(String calismaSaati) {
        System.out.println(getAdSoyad()+" calisma saati : "+calismaSaati);
    }
}
