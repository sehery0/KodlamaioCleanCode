package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import entities.concretes.Course;

public class StandartPriceCampaignManager implements CampaignService{

	@Override
	public void updatePrice(List<Course> courses) {
		for (Course course: courses)
            course.price=getCurrentBasePrice();
	}

	private double getCurrentBasePrice() {
        return 45;
	}
}
