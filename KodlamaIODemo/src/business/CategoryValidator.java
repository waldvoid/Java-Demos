package business;

import entities.Category;
import java.util.ArrayList;
import java.util.List;


public class CategoryValidator {
    List<Category> categories = new ArrayList<>();

    public CategoryValidator(Category category) throws Exception {
        for (Category c : categories) {
            if (c.getCategoryName() == category.getCategoryName()) {
                throw new Exception("Kategori ismi aynı olamaz");
            }
        }

    }
}
