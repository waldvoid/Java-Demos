
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

import javax.xml.catalog.Catalog;

public class Main {
    public static void main(String[] args) throws Exception {
        // logging array
        Logger[] loggers = {new MailLogger(), new DatabaseLogger(), new FileLogger()};

        // Category Add
        Category categoryProgramlama = new Category("Programlama");
        // Category validator
        CategoryValidator categoryValidator = new CategoryValidator(categoryProgramlama);
        // Construct
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categoryValidator);
        categoryManager.add(categoryProgramlama);

        // Lecturer Add
        Lecturer lecturerMert = new Lecturer(1, "Mert", "Evirgen", "www.resim.com/lecturer");
        LecturerManager lecturerManager = new LecturerManager(new JdbcLecturerDao(), loggers);
        lecturerManager.add(lecturerMert);

        // Course Add
        Course courseJava = new Course(1, "Java Kampı", "www.resim.com/javacourse", 100,
                categoryProgramlama, lecturerMert);
        // Category validator
        CourseValidator courseValidator = new CourseValidator(courseJava);
        // Construct
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.add(courseJava);





    }


}