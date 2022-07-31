package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Course;

public interface CourseDao {
	void add(Course course);
    List<Course> getCourse();

}
