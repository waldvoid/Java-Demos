package dataAccess.jdbc;

import dataAccess.ICourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements ICourseDao {

    List<Course> courses = new ArrayList<>();
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + ": Jdbc ile veritabanına eklendi");

    }

    @Override
    public void remove(Course course) {
        System.out.println(course.getCourseName() + ": Jdbc ile veritabanından silindi");

    }

    @Override
    public List<Course> getAll() {

        return courses;
    }
}
