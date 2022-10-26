
import business.*;
import dataAccess.HibernateCategoryDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcLecturerDao;
import entities.Category;
import entities.Course;
import entities.Lecturer;
import logging.DatabaseLogger;
import logging.FileLogger;
import logging.Logger;
import logging.MailLogger;


public class Main {
    public static void main(String[] args) throws Exception {
        // logging array
        Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};

        // Category Add
        Category categoryProgramlama = new Category("Programlama");
        // Construct
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        categoryManager.add(categoryProgramlama);

        // Lecturer Add
        Lecturer lecturerMert = new Lecturer(1, "Mert", "Evirgen", "www.resim.com/lecturer");
        LecturerManager lecturerManager = new LecturerManager(new JdbcLecturerDao(), loggers);
        lecturerManager.add(lecturerMert);

        // Course Add
        Course courseJava = new Course(1, "Java Kampı", "www.resim.com/javacourse", 100,
                categoryProgramlama, lecturerMert);
        Course courseJavascript = new Course(2, "Java Kampı", "www.resim.com/javascriptcourse", -500,
                categoryProgramlama, lecturerMert);
        // Construct
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(courseJava);
        courseManager.add(courseJavascript);





    }


}