package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StudentsTest {
    Doctor doctor = new Doctor("Little", "Joht", "Lankaster", 30, 3);
    Teacher teacher = new Teacher("Sinatra", "Frank", "New York", 45);
    Teacher teacher2 = new Teacher("Thornton", "Billy Bob", "Sydney", 52);
    Students students = new Students("Miller", 3, true, teacher);

    @Test
    public void illness() throws Exception {
        boolean result = students.illness(doctor);
        boolean expected = false;
        assertThat(result, is(expected));
    }

    @Test
    public void changeCurator() throws Exception {
        students.changeCurator(teacher2);
        Teacher result = students.getKurator();
        Teacher expected = teacher2;
        assertThat(result, is(expected));
    }

}