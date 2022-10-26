package business;

import dataAccess.ICourseDao;
import entities.Course;
import logging.Logger;

import java.util.ArrayList;
import java.util.List;


public class CourseManager {
   ICourseDao courseDao;
   Logger[] loggers;
   List<Course> courses;


    public CourseManager(ICourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }



    public void add(Course course) throws Exception {
        for (Course c: courses) {
            if(c.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Girdiğiniz kurs zaten mevcut lütfen başka bir isim giriniz.");
            }
            if(course.getCoursePrice() < 0) {
                throw new Exception("Kursun fiyatı 0 TL'den az olamaz");
            }
        }
        courseDao.add(course);
        for (Logger logger : loggers) {
            logger.log(course.getCourseName() + " Eklendi");
        }
    }

    public void remove(Course course) throws Exception {
        for (Course c: courses) {
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
