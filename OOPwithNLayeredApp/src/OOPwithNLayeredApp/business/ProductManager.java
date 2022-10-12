package OOPwithNLayeredApp.business;

import OOPwithNLayeredApp.dataAccess.HibernateProductDao;
import OOPwithNLayeredApp.dataAccess.ProductDao;
import OOPwithNLayeredApp.entities.Product;
import OOPwithNLayeredApp.dataAccess.jdbcProductDao;

public class ProductManager {
    private ProductDao productDao;
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
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
    }
}
