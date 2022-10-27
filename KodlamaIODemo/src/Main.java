
import business.*;
import dataAccess.hibernate.HibernateCategoryDao;
import dataAccess.hibernate.HibernateCourseDao;
import dataAccess.jdbc.JdbcLecturerDao;
import entities.Category;
import entities.Course;
import entities.Lecturer;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;


public class Main {
    public static void main(String[] args) throws Exception {
        // core.logging array
        Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};

        // Category Adding
        Category categoryProgramlama = new Category("Programlama");

        // Construct
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        categoryManager.add(categoryProgramlama);

        // Lecturer Add
        Lecturer lecturerMert = new Lecturer(1, "Mert", "Evirgen", "www.resim.com/lecturer");
        LecturerManager lecturerManager = new LecturerManager(new JdbcLecturerDao(), loggers);
        lecturerManager.add(lecturerMert);

        // Course Adding
        Course courseJava = new Course(1, "Java Kampı", "www.resim.com/javacourse", 100,
                categoryProgramlama, lecturerMert);
        Course courseJavascript = new Course(2, "Java Kampı", "www.resim.com/javascriptcourse", 500,
                categoryProgramlama, lecturerMert);

        // Construct
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(courseJava);
        courseManager.add(courseJavascript);





    }


}