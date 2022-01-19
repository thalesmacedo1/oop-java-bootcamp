import com.bootcampabstraction.challenge.domain.Course;
import com.bootcampabstraction.challenge.domain.Mentorship;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java 11");
        course1.setDescription("Java 11 Masterclass for beginners.");
        course1.setDuration(12);

        Course course2 = new Course();
        course2.setTitle("Spring Boot + Angular");
        course2.setDescription("Fullstack SpringBoot + Angular full project.");
        course2.setDuration(30);

        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("Career Mentorship");
        mentorship1.setDescription("Create a perfect roadmap for your career with the advice of experts.");
        mentorship1.setDate(LocalDate.now());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(mentorship1);
    }
}
