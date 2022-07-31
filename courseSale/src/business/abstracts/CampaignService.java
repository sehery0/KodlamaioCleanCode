package business.abstracts;

import java.util.List;

import entities.concretes.Course;

public interface CampaignService {
	void updatePrice(List<Course> courses);

}
