package business;


import entities.Course;
import java.util.ArrayList;
import java.util.List;

public class CourseValidator {
    List<Course> courses = new ArrayList<>();

    public CourseValidator(Course course) {
        for (Course c : courses) {
            if (c.getCourseName() == course.getCourseName()) {
                return false;
            } else {
                return true;
            }
        }

    }
}
