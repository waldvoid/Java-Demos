public class ProductManager {
    public void add(Product product) {
        //JDBC
            System.out.println("Product added " + product.getDescription() + " " + product.getName());

    }

    //bad usage!! use the method above!
   /* public void add2 (int id, String name, String description, int stockAmount, double price) {
    } */


}
