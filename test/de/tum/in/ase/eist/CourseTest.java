package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

	// TODO 1: Test getCourseTitle()
    @Test
    public void testGetCourseTitle() {
        Course course = new Course("EIST is the best");
        assertEquals("EIST is the best", course.getTitle());
    }

	// TODO 2: Test getNumberOfAttendees()
    @Test
    public void testNoAttendees() {
        Course course = new Course("EIST is the best");
        assertEquals(0, course.getAttendees().size());
    }

    @Test
    public void  testThreeAttendees() {
        Course course = new Course("EIST is the best");
        Student student1 = new Student("Max", "Mustermann", "01.01.2000", "CS", "Software Engineering");
        Student student2 = new Student("Sophie", "Maier", "02.02.2002", "Mathe", "Lineare Algebra");
        Student student3 = new Student("Ben", "Müller", "03.03.1999", "TUM BWL", "Micro Ökonomik");
        course.addAttendee(student1);
        course.addAttendee(student2);
        course.addAttendee(student3);
        assertEquals(3, course.getAttendees().size());
    }

}
