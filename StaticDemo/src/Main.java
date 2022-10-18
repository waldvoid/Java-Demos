public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "Dark Mouse";

        productManager.add(product);

        // yapıcı bloğun çalışaiblmesi için newledik
        // statik yapıcı blok newlemesen de çalışır
        ProductValidator productValidator = new ProductValidator();

    }
}