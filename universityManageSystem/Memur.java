package University;
public abstract class Memur extends Calisan{
    private String departman;
    private String mesai;

    public Memur(String adSoyad, String telefon, String eposta,String departman,String mesai) {
        super(adSoyad, telefon, eposta);
        this.departman = departman;
        this.mesai = mesai;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public abstract void calis(String calismaSaati);

    @Override
    public void giris() {
        System.out.println(getAdSoyad()+" Memuru B kapisindan giris yapti");
    }

    @Override
    public void cikis() {
        System.out.println(getAdSoyad()+" Memuru B kapisindan giris yapti");

    }
    @Override
    public void yemekhane() {
        super.yemekhane();
    }
}
