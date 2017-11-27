package ru.job4j;

/**
 * Class Teacher.
 * Класс, описывающий поведение учителя.
 *
 * @autor alavrinenko.
 */
public class Teacher extends Profession {
    private Students[] groupEducation = new Students[3];    // группа студентов, обучающихся у учителя
    private String[] kurs = new String[3];                  // массив предметов, которые учитель преподает

    /**
     * Конструктор для объекта Учитель.
     *
     * @param surname фамилия.
     * @param name имя.
     * @param city город проживания.
     * @param age возраст.
     */
    public Teacher(String surname, String name, String city, int age) {
        this.surname = surname;
        this.name = name;
        this.city = city;
        this.age = age;
        countProf++;
    }

    /**
     * Метод setKurs.
     * Формируем массив предметов, которые читает преподаватель.
     *
     * @param subjectOne первый предмет.
     * @param subjectTwo второй предмет.
     * @param subjectThree третий предмет.
     */
    public void setKurs(String subjectOne, String subjectTwo, String subjectThree) {
        this.kurs[0] = subjectOne;
        this.kurs[1] = subjectTwo;
        this.kurs[2] = subjectThree;
    }

    /**
     * Метод getKurs.
     * Получаем по индексу элемент массива предметов, которые читает преподаватель.
     *
     * @param index первый предмет.
     */
    public String getKurs(int index) {
        return kurs[index];
    }

    /**
     * Метод groupForEducation.
     * Формируем группу студентов у данного учителя.
     *
     * @param students0 первый студент в группе.
     * @param students1 второй студент в группе.
     * @param students2 третий студент в группе.
     */
    public void groupForEducation(Students students0, Students students1, Students students2) {
        this.groupEducation[0] = students0;
        this.groupEducation[1] = students1;
        this.groupEducation[2] = students2;
    }

    /**
     * Метод getGroupEducation.
     * Получаем по индексу элемент массива фамилий студентов, которые обучаются у преподавателя.
     *
     * @param index первый предмет.
     */
    public String getGroupEducation(int index) {
        return groupEducation[index].surname;
    }
}