package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DoctorTest {
    Doctor doctor = new Doctor("Little", "Joht", "Lankaster", 30, 3);
    Engineer engineer = new Engineer("Tall", "Frank", "New Oregon", 40, true, true);

    @Test
    public void medication() throws Exception {
        int result = doctor.medication();
        int expected = 4;
        assertThat(result, is(expected));
    }

    @Test
    public void addNewPills() throws Exception {

        doctor.addNewPills(doctor);
        int result = doctor.getPills();
        int expected = 25;
        assertThat(result, is(expected));
    }

    @Test
    public void medicalInspection() throws Exception {
        boolean result = doctor.medicalInspection(engineer);
        boolean expected = false;
        assertThat(result, is(expected));
    }
}