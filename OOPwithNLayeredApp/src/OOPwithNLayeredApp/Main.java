package OOPwithNLayeredApp;
import OOPwithNLayeredApp.business.ProductManager;
import OOPwithNLayeredApp.dataAccess.HibernateProductDao;
import OOPwithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {

        Product product1 = new Product(1, "Iphone XR", 9999);
        ProductManager productManager = new ProductManager(new HibernateProductDao());
        productManager.add(product1);

    }
}

