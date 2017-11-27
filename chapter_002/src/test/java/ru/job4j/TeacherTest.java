package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class TeacherTest {
    Teacher teacher = new Teacher("Sinatra", "Frank", "New York", 45);
    Teacher teacher2 = new Teacher("Thornton", "Billy Bob", "Sydney", 52);
    Students students = new Students("Mellory",4, true, teacher2);
    Students students2 = new Students("Braun",4, true, teacher2);
    Students students3 = new Students("Zimmer", 4, true, teacher2);


    @Test
    public void setKurs() throws Exception {
        teacher.setKurs("Mathematics", "Physics","Chemistry");
        String result = teacher.getKurs(0) + teacher.getKurs(1)+teacher.getKurs(2);
        String expected = "MathematicsPhysicsChemistry";
        assertThat(result, is(expected));
    }

    @Test
    public void groupForEducation() throws Exception {
		teacher2.groupForEducation(students, students2, students3);
        String result = teacher2.getGroupEducation(0) + teacher2.getGroupEducation(1)+teacher2.getGroupEducation(2);
        String expected = "MelloryBraunZimmer";
        assertThat(result, is(expected));
    }

}