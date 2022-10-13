package OOPwithNLayeredApp.business;

import OOPwithNLayeredApp.com.logging.Logger;
import OOPwithNLayeredApp.dataAccess.HibernateProductDao;
import OOPwithNLayeredApp.dataAccess.ProductDao;
import OOPwithNLayeredApp.entities.Product;
import OOPwithNLayeredApp.dataAccess.jdbcProductDao;

import java.util.List;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        // iş kuralları  - mail kontrol, tc kontrol aynısı var mı vb.
        if (product.getUnitPrice() < 10) throw new Exception("Ürün fiyatı 10'dan küçük olamaz");

        // ProductDao interface'i ile kurallarını tanımlayıp uygulayabilir ve referans olma sayesinde inheritance kullanabilirsin.
        // Ama bu çok temiz bir yöntem değil değişim yapmak istediğinde sıkıntı olabilir
    /* ProductDao productDao = new jdbcProductDao();
    ProductDao productDao2 = new HibernateProductDao();
        productDao.add(product);
        productDao2.add(product); */

        // productDao Interface'i üzerinden çalıştıralım böylece bir yere bağımlı kalmayalım
        productDao.add(product);

        for (Logger logger: loggers) {
            logger.log(product.getName());
            
        }
    }
}
