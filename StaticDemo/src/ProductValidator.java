// Sadece kullan bırak araçlar statik yapılıyor
// Yapıcı bloklar newleyince çalışır sadece, static de veremezsin yasak zaten

public class ProductValidator {

    static {
        System.out.println("Statik yapıcı blok çalıştı");
    }
    public ProductValidator() {
        System.out.println("Yapıcı blok çalıştı ");

    }

    public static boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
