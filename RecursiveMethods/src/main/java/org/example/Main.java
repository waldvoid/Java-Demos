package org.example;

// recursive fonksiyonlar kendi içerisinde kendisini tekrar çağırırlar ve sonucu hesaplarlar
// recursive fonksiyonlar bir yaklaşım yöntemidir
// öngörülemeyen derinliği tahmin edilemeyen durumlarda daha çok kullanılır // klasör dizini çekme kaç klasör olduğunu bilmiyorsun
// döngüler yerine daha çok kullanılır - döngülerin yerine recursive kullanılır ama her recursive için döngü kullanılamaz
// recursive methodlar her zaman returnlü veya returnsüz olabilir ama kendini tekrar çağırmak zorundadır
// recursive kontrol etmesi zordur o yüzden fonksiyon parametreleri üzerinden yürümek önemli
public class Main {
    //region Basit Recursive ve Loop karşılaştırma örneği
    static int add(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            sum += i;
        }
        return sum;
    }
    static int rec(int y){
        if (y == 1) {
            return 1;
    } return y + rec(y-1);
    }
    //endregion

    //region Sonsuz döngü
    // sonsuz döngü örneği ama iç kısmında tekrar çağırma patterni farklı yerlerde kullanabilirsin
    static void sonsuzDongu() {
        System.out.println("Merhaba");
        sonsuzDongu();
        System.out.println("Dünya");
    }
    //endregion

    //region Merhaba dünya yazdırma Recursive
    // 4 merhaba 1 dünya yazdıralım mesela
    static int sonluSum = 0;
    static void sonluDongu(int a) {
        System.out.println("Merhaba");
        if ( a < 3) {
        sonluDongu(++a); }
        System.out.println("Dünya");
    }
    //endregion

    //region 5'li Toplama Recursive Örnek
    // Aradaki sayıların 5'in katları olanını toplayıp sunan bir recursive yazalım
    static int besinKatlari(int baslangic, int bitis) {
        if (baslangic % 5 == 0 && baslangic <= bitis) {
            return baslangic + besinKatlari(baslangic + 5, bitis);
        } else if (baslangic % 5 > 0 && baslangic <= bitis) {
            return besinKatlari(++baslangic, bitis);
        }
        return 0;
    }
    //endregion


    public static void main(String[] args) {

        System.out.println(rec(55));
        System.out.println(add(55));
        sonluDongu(1);
        System.out.println(besinKatlari(50, 55));
        }


}