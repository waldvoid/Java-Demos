package dataAccess;

import entities.Course;

public class JdbcCourseDao implements ICourseDao {
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + ": Jdbc ile veritabanına eklendi");

    }

    @Override
    public void remove(Course course) {
        System.out.println(course.getCourseName() + ": Jdbc ile veritabanından silindi");

    }
}
