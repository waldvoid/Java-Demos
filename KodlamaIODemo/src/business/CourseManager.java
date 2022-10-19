package business;

import dataAccess.ICourseDao;
import entities.Course;
import logging.Logger;

public class CourseManager {
   ICourseDao courseDao;
   Logger[] loggers;
   CourseValidator validator;

    public CourseManager(ICourseDao courseDao, Logger[] loggers, CourseValidator validator) {
        this.courseDao = courseDao;
        this.loggers = loggers;
        this.validator = validator;
    }

    public void add(Course course) {
        courseDao.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getCourseName() + " Eklendi");
        }
    }

    public void remove(Course course) {
        courseDao.remove(course);
        for (Logger logger : loggers) {
            logger.log(course.getCourseName() + " Silindi");
        }
    }


}
