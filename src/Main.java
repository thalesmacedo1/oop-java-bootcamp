import com.bootcampabstraction.challenge.domain.Bootcamp;
import com.bootcampabstraction.challenge.domain.Course;
import com.bootcampabstraction.challenge.domain.Dev;
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

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Java Developer Bootcamp");
        bootcamp.setDescription("Develop backend applications faster than expected");
        bootcamp.getContent().add(course1);
        bootcamp.getContent().add(course2);
        bootcamp.getContent().add(mentorship1);

        Dev devThales = new Dev();
        devThales.setName("Thales");
        devThales.subscribeBootcamp(bootcamp);
        System.out.println("Thales' Assigned Contents: " + devThales.getSubscribedContents());
        devThales.advance();
        devThales.advance();
        System.out.println("Thales' Completed Contents: " + devThales.getFinishedContents());
        System.out.println("XP: " + devThales.calculateXp());

        Dev devMatt = new Dev();
        devMatt.setName("Matt");
        devMatt.subscribeBootcamp(bootcamp);
        System.out.println("Matt's Assigned Contents: " + devMatt.getSubscribedContents());
        devMatt.advance();
        System.out.println("Matt's Completed Contents: " + devMatt.getFinishedContents());
        System.out.println("XP: " + devMatt.calculateXp());

    }
}
