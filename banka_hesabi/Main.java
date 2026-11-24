package banka_hesabi;

public class Main {
    public static void main(String[] args) {

        // Banka hesaplarini olusturma
        BankaHesabi hesap1 = new BankaHesabi("Ayse Yilmaz", "1001", 10000);
        BankaHesabi hesap2 = new BankaHesabi("Mehmet Demir", "1002", 5000);

        // Baslangic bakiyeleri
        System.out.println("\n===== BASLANGIC BAKIYELERI =====");

        hesap1.hesapBilgileriniGoster();
        System.out.println();

        hesap2.hesapBilgileriniGoster();

        // Para yatirma
        System.out.println("\n--- PARA YATIRMA ---");
        hesap1.paraYatir(2000);

        // Para cekme
        System.out.println("\n--- PARA CEKME ---");
        hesap1.paraCek(1500);

        // Havale
        System.out.println("\n--- HAVALE ---");
        hesap1.havaleYap(hesap2, 3000);

        // Son hesap bilgileri
        System.out.println("\n--- SON HESAP DURUMLARI ---");

        hesap1.hesapBilgileriniGoster();

        System.out.println();

        hesap2.hesapBilgileriniGoster();
    }
}
