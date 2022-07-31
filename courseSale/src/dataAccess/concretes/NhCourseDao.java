package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

public class NhCourseDao implements CourseDao{
	 List<Course> courses = new ArrayList<>();

	@Override
	public void add(Course course) {
		courses.add(course);
		
	}

	@Override
	public List<Course> getCourse() {
		return courses;
	}

}
