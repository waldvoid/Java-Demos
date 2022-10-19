package entities;

public class Course {
    int id;
    String courseName;
    String courseImage;
    double coursePrice;
    Category categoryName;

    public Course(int id, String courseName, String courseImage, double coursePrice, Category categoryName, Lecturer firstName) {
        this.id = id;
        this.courseName = courseName;
        this.courseImage = courseImage;
        this.coursePrice = coursePrice;
        this.categoryName = categoryName;
        this.firstName = firstName;
    }

    Lecturer firstName;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseImage() {
        return courseImage;
    }

    public void setCourseImage(String courseImage) {
        this.courseImage = courseImage;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public Category getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(Category categoryName) {
        this.categoryName = categoryName;
    }

    public Lecturer getFirstName() {
        return firstName;
    }

    public void setFirstName(Lecturer firstName) {
        this.firstName = firstName;
    }



}
