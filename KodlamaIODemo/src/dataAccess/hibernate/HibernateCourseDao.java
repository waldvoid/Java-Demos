package dataAccess.hibernate;

import dataAccess.ICourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements ICourseDao {

    List<Course> courses = new ArrayList<>();
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + ": Hibernate ile veritabanına eklendi");

    }

    @Override
    public void remove(Course course) {
        System.out.println(course.getCourseName() + ": Hibernate ile veritabanından silindi");

    }
    @Override
    public List<Course> getAll() {

        return courses;
    }
}
