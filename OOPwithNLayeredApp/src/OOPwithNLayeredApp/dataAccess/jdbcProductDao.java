package OOPwithNLayeredApp.dataAccess;

import OOPwithNLayeredApp.entities.Product;

public class jdbcProductDao implements ProductDao {
    public void add(Product product) {
        // sadece db erişim kodları buraya yazılır // SQL
        System.out.println("jdbc ile veritabanına eklendi");
    }
}
