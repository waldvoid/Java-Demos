package entities;

public class Category {
    public Category(String categoryName) {
        this.categoryName = categoryName;
    }

    String categoryName;

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }


}
