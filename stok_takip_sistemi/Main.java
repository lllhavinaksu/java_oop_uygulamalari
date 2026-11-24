package stok_takip_sistemi;

public class Main {
    public static void main(String[] args) {
        // Stok sınıfından bir nesne oluşturuyoruz
        // Parametreler: Ürün Adı, Gelen Adet, Satılan Adet, Alış Fiyatı, Satış Fiyatı
        Stok urun1 = new Stok("Kulaklik", 300, 80, 200.0, 350.0);
        Stok urun2 = new Stok("Mouse", 100, 50, 150.0, 180.0);

        // Nesneye ait bilgileri ve hesaplamaları ekrana yazdırıyoruz
        System.out.println("""
        
        ------ürün 1------
        """);
        urun1.bilgileriYazdir();
        System.out.println("""

        ------ürün 2------
        """);
        urun2.bilgileriYazdir();
    }
}



