package dataAccess;

import entities.Course;

public class HibernateCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println(course.getCourseName() + ": Hibernate ile veritabanına eklendi");

    }

    @Override
    public void remove(Course course) {
        System.out.println(course.getCourseName() + ": Hibernate ile veritabanından silindi");

    }
}
