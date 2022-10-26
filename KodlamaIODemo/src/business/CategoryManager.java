package business;

import dataAccess.ICategoryDao;
import entities.Category;
import logging.Logger;

public class CategoryManager{
    ICategoryDao categoryDao;
    Logger[] loggers;

    public CategoryManager(ICategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) {

        categoryDao.add(category);
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName() + " Eklendi");
        }
    }

    public void remove(Category category) {
        categoryDao.remove(category);
        for (Logger logger : loggers) {
            logger.log(category.getCategoryName() + " Silindi");
        }
    }

}
