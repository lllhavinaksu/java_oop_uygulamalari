package stok_takip_sistemi;

public class Stok {

    // Değişkenler (Encapsulation)
    private String urunAdi;
    private int gelenAdeti;
    private int satilanAdeti;
    private double alisFiyati;
    private double satisFiyati;

    // Constructor
    public Stok(String urunAdi, int gelenAdet, int satilanAdet, 
            double alisFiyati, double satisFiyati) {
        this.urunAdi = urunAdi;
        this.gelenAdeti = gelenAdet;
        this.satilanAdeti = satilanAdet;
        this.alisFiyati= alisFiyati;
        this.satisFiyati = satisFiyati;
    }

    // Getter ve Setter metotları
    public String getUrunAdi() {
        return urunAdi;
    }
    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }
    public int getGelenAdet() {
        return gelenAdeti;
    }
    public void setGelenAdet(int gelenAdeti) {
        this.gelenAdeti = gelenAdeti;
    }
    public int getSatilanAdet() {
        return satilanAdeti;
    }
    public void setSatilanAdet(int satilanAdeti) {
        this.satilanAdeti = satilanAdeti;
    }
    public double getAlisFiyati() {
        return alisFiyati;
    }
    public void setAlisFiyati(double alisFiyati) {
        this.alisFiyati = alisFiyati;
    }
    public double getSatisFiyati() {
        return satisFiyati;
    }
    public void setSatisFiyati(double satisFiyati) {
        this.satisFiyati = satisFiyati;
    }

    //metodlar 

    // Kalan stok hesaplama
    public int kalanStok() {
        return gelenAdeti - satilanAdeti;
    }

    // Alış değeri hesaplama
    public double toplamAlisMaliyeti() {
        return kalanStok() * alisFiyati;
    }

    // Satış değeri hesaplama
    public double toplamSatisDegeri() {
        return kalanStok() * satisFiyati;
    }

    // Birim kar hesaplama
    public double birimKar() {
        return satisFiyati - alisFiyati;
    }

    // Kar oranı hesaplama
    public double karOrani() {
        if (alisFiyati == 0) {
            return 0;
        }
        return (birimKar() / alisFiyati) * 100;
    }

    // Bilgileri ekrana yazdıran metot
    public void bilgileriYazdir() {
        System.out.println("Urun Adi: " + urunAdi);
        System.out.println("Gelen Mal Adeti: " + gelenAdeti);
        System.out.println("Satilan Mal Adeti: " + satilanAdeti);
        System.out.println("Kalan Stok Adeti: " + kalanStok());
        System.out.println("Alis Fiyati: " + alisFiyati + " TL");
        System.out.println("Satis Fiyati: " + satisFiyati + " TL");
        System.out.println("---------------------------------");
        System.out.println("Stoklarin Toplam Aliş Maliyeti: " + toplamAlisMaliyeti() + " TL");
        System.out.println("Stoklarin Toplam Satiş Degeri: " + toplamSatisDegeri() + " TL");
        System.out.println("Tek Urunun Kar Miktari: " + birimKar() + " TL");
        System.out.println("Kar Orani: %" + karOrani());
    }
}