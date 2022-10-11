    public class Main {
    public static void main(String[] args) {

       Product product = new Product(2, "Laptop", "MSI Stealth", 9000, 3, "black");

        Product product2 = new Product();
            product2.setName("Laptop");
            product2.setId(1);
            product2.setDescription("Asus ROG Strix");
            product2.setPrice(5000);
            product2.setStock(3);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.add(product2);

        System.out.println(product.getPrice());
        System.out.println(product.getSpecialCode());
        System.out.println(product2.getPrice());
        System.out.println(product2.getSpecialCode());
    }
}