package business.abstracts;

import java.util.List;

import entities.concretes.Course;

public interface CourseService {
	void add(Course course);
    List<Course> getAll();
    List<Course> getAllWithCampaign();

}
