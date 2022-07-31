package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import business.abstracts.CourseService;
import dataAccess.abstracts.CourseDao;
import entities.concretes.Course;

public class CourseManager implements CourseService {
	private CourseDao courseDao;
	private CampaignService campaignService;

	public CourseManager(CourseDao courseDao, CampaignService campaignService) {
		super();
		this.courseDao = courseDao;
		this.campaignService = campaignService;
	}

	@Override
	public void add(Course course) {
		courseDao.add(course);

	}

	@Override
	public List<Course> getAll() {
		return courseDao.getCourse();
	}

	@Override
	public List<Course> getAllWithCampaign() {
		campaignService.updatePrice(courseDao.getCourse());
        return courseDao.getCourse();
	}

}
