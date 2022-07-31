package courseSale;

import business.abstracts.CourseService;
import business.concretes.CourseManager;
import business.concretes.StandartPriceCampaignManager;
import dataAccess.concretes.NhCourseDao;
import entities.concretes.Course;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"C# kursu",450.80);
        Course course2 = new Course(1,"Java kursu",100);
        Course course3 = new Course(1,"Pythom kursu",157.90);
        
        CourseService courseService = new CourseManager(new NhCourseDao(), new StandartPriceCampaignManager());
        courseService.add(course1);
        courseService.add(course2);
        courseService.add(course3);
        
        for (Course course: courseService.getAllWithCampaign())
            System.out.println("course name = "+course.name+" : course price = "+course.price);


	}

}
