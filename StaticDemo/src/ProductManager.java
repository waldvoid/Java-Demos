public class ProductManager {
    public void add(Product product) {
        if (ProductValidator.isValid(product)) {
            System.out.println("Veritabanına eklendi");
        } else {
            System.out.println("Veritabanına eklenemedi");
        }
    }
}
