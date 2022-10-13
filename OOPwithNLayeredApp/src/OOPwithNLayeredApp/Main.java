package OOPwithNLayeredApp;
import OOPwithNLayeredApp.business.ProductManager;
import OOPwithNLayeredApp.com.logging.DatabaseLogger;
import OOPwithNLayeredApp.com.logging.FileLogger;
import OOPwithNLayeredApp.com.logging.Logger;
import OOPwithNLayeredApp.com.logging.MailLogger;
import OOPwithNLayeredApp.dataAccess.HibernateProductDao;
import OOPwithNLayeredApp.entities.Product;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Logger[] loggers = new Logger[] {new MailLogger(), new DatabaseLogger(), new FileLogger()};
        Product product1 = new Product(1, "Iphone XR", 9999);
        ProductManager productManager = new ProductManager(new HibernateProductDao(), loggers);

        productManager.add(product1);

    }
}

