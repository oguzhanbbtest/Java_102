package University;

public class GuvenlikGorevlisi extends Memur{
    private String gorev;

    public GuvenlikGorevlisi(String adSoyad, String telefon, String eposta, String departman, String mesai, String gorev) {
        super(adSoyad, telefon, eposta, departman, mesai);
        this.gorev = gorev;
    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void nobet(){
        System.out.println(getAdSoyad()+" Nöbette ...!!");
    }
    @Override
    public void calis(String calismaSaati){
        System.out.println(getAdSoyad()+" çalışma saatleri :" + calismaSaati);
    }
}
