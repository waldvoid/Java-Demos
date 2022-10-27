package business;

import dataAccess.ICourseDao;
import entities.Course;
import core.logging.Logger;


public class CourseManager {
   ICourseDao courseDao;
   Logger[] loggers;


    public CourseManager(ICourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }



    public void add(Course course) throws Exception {
        if(course.getCoursePrice() < 0) {
            throw new Exception("Kursun fiyatı 0 TL'den az olamaz");
        }
        for (Course c: courseDao.getAll()) {
            if(c.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Girdiğiniz kurs zaten mevcut lütfen başka bir isim giriniz.");
            }
        }
        courseDao.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getCourseName() + " Eklendi");
        }
    }

    public void remove(Course course) throws Exception {
        for (Course c: courseDao.getAll()) {
            if(c.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Girdiğiniz kurs zaten mevcut lütfen başka bir isim giriniz.");
            }
            if(course.getCoursePrice() < 0) {
                throw new Exception("Kursun fiyatı 0 TL'den az olamaz");
            }
        }
        courseDao.remove(course);
        for (Logger logger : loggers) {
            logger.log(course.getCourseName() + " Silindi");
        }
    }


}
