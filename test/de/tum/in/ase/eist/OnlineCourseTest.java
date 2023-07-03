package de.tum.in.ase.eist;

import org.junit.jupiter.api.*;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.*;

class OnlineCourseTest {

	// TODO 3: Test setOnlineCourseUrl()
    @Test
    public void  testSetOnlineCourseUrlWithValidUrl() throws MalformedURLException {
        OnlineCourse onlineCourse = new OnlineCourse("EIST Moodle");
        URL url = new URL("https://artemis.in.tum.de/courses/241/exercises/9427");
        onlineCourse.setUrl("https://artemis.in.tum.de/courses/241/exercises/9427");
        assertEquals(url, onlineCourse.getUrl());
    }

    @Test
    public void  testSetOnlineCourseUrlWithInvalidUrl() throws MalformedURLException {
        OnlineCourse onlineCourse = new OnlineCourse("EIST Moodle");
        assertThrows(MalformedURLException.class, () -> onlineCourse.setUrl("invalidUrl"));
    }
}
