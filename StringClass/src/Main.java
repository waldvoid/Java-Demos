public class Main {
    public static void main(String[] args) {
        // str.length() : girilen karakterin sayısı
        // str.concat(str2) : String birleştirme
        // str.indexof('K') : Karakterin konumunu verir
        // str.charAt(5) : indexOf benzer, konumu verilen karakteri okur
        // str.compareTo("Kodlama") : büyük/küçük harf duyarlı olarak karşılaştırır
        // str.compareToIgnoreCase("KoDLama") : harf duyarsıs karşılaştırır
        // str.contains("kod") : içinde geçiyor mu kontrol eder
        // str.endsWith("a") : bitiyor mu bakar
        // str.replace("Kodlama", "Java") : string içinde değişiklik yapar
        // str.toLowerCase(), str.toUpperCase() : büyük veya küçük harfe dönüştürür

        String str = "Kodlama en önemli adımlardan biridir, Java kodlama dillerinden biri sayılır";
        System.out.println(str.replace("Kodlama", "Kontrol"));
    }
}