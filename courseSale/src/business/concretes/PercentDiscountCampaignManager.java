package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import entities.concretes.Course;

public class PercentDiscountCampaignManager implements CampaignService{

	@Override
	public void updatePrice(List<Course> courses) {
		for (Course course: courses)
            course.price=course.price-(course.price*getPercentageDiscount());
	}
	
	 private double getPercentageDiscount() {
	        return 0.30;
	 }

}
