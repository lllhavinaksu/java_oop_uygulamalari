package banka_hesabi;

public class BankaHesabi {

    // Ozellikler
    private String hesapSahibi;
    private String hesapNo;
    private double bakiye;

    // Constructor
    public BankaHesabi(String hesapSahibi, String hesapNo, double bakiye) {
        this.hesapSahibi = hesapSahibi;
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
    }

    public BankaHesabi(String hesapSahibi, String hesapNo) {
        this.hesapSahibi = hesapSahibi;
        this.hesapNo = hesapNo;
        this.bakiye = 0;
    }

    // Getter ve Setter metotlari

    public String getHesapSahibi() {
        return hesapSahibi;
    }

    public void setHesapSahibi(String hesapSahibi) {
        this.hesapSahibi = hesapSahibi;
    }

    public String getHesapNo() {
        return hesapNo;
    }


    public void setHesapNo(String hesapNo) {
         if (hesapNo == null) {
            System.out.println("Hata! : Hesap numarsı boş bırakılamaz!");
            return;
        }
        if (hesapNo.length() < 4) {
            System.out.println("Hata! : Hesap numarası eksik girildi! En az 4 karakter olmalı.");
        }
        this.hesapNo = hesapNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        if (bakiye >= 0) {
            this.bakiye = bakiye;
        }
        else{
            System.out.println("Hata! : Bakiye negatif bir değer olamaz!");
        }
    }

    // Para yatirma
    public void paraYatir(double tutar) {
        if (tutar > 0) {
            bakiye += tutar;
            System.out.println(getHesapSahibi() + " hesabina " + tutar + " TL para yatirildi.");
        } else {
            System.out.println("Gecersiz tutar!");
        }
    }

    // Para cekme
    public boolean paraCek(double tutar) {
        if (tutar > 0 && tutar <= bakiye) {
            bakiye -= tutar;
            System.out.println(getHesapSahibi()+ " hesabindan " + tutar + " TL para cekildi.");
            return true;
        } else {
            System.out.println("Yetersiz bakiye veya gecersiz tutar!");
            return false;
        }
    }

    // Havale / EFT
    public void havaleYap(BankaHesabi alici, double tutar) {
        if (alici == null || alici == this) {
            System.out.println("Gecersiz alici!");
            return;
        }

        if (paraCek(tutar)) {
            alici.paraYatir(tutar);
            System.out.println("Havale islemi basarili.");
        }
    }

    // Hesap bilgilerini gosterme
    public void hesapBilgileriniGoster() {
        System.out.println("Hesap sahibi: " + getHesapSahibi());
        System.out.println("Hesap numarasi: " + getHesapNo());
        System.out.println("Bakiye: " + getBakiye() + " TL");
    }
}