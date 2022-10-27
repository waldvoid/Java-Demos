package dataAccess;

import entities.Course;

import java.util.List;

public interface ICourseDao {
    void add(Course course);
    void remove(Course course);

    List<Course> getAll();
}
