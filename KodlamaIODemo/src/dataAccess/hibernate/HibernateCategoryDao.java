package dataAccess.hibernate;

import dataAccess.ICategoryDao;
import entities.Category;

public class HibernateCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println(category.getCategoryName() + ": Hibernate ile veritabanına eklendi");

    }

    @Override
    public void remove(Category category) {
        System.out.println(category.getCategoryName() + ": Hibernate ile veritabanından silindi");

    }
}
