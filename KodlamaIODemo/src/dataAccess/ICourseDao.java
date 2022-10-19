package dataAccess;

import entities.Course;

public interface ICourseDao {
    void add(Course course);
    void remove(Course course);
}
