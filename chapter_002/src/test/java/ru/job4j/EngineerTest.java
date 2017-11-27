package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EngineerTest {
    Doctor doctor = new Doctor("Little", "Joht", "Lankaster", 30, 3);
    Engineer engineer = new Engineer("Tall", "Frank", "New Oregon", 40, true, true);

    @Test
    public void repairOfEquipment() throws Exception {
        boolean result = engineer.repairOfEquipment(doctor);
        boolean expected = true;
        assertThat(result, is(expected));
    }

    @Test
    public void testingEquipment() throws Exception {
        boolean result = engineer.testingEquipment(doctor);
        boolean expected = true;
        assertThat(result, is(expected));
    }
}