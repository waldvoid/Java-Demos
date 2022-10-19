package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements ICategoryDao{
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + ": Jdbc ile veritabanına eklendi");

    }

    @Override
    public void remove(Category category) {
        System.out.println(category.getCategoryName() + ": Jdbc ile veritabanından silindi");

    }
}
