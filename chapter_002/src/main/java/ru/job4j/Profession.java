package ru.job4j;

/**
 * Class Profession (родительский).
 * Класс, описывающий поведение врача.
 *
 * @autor alavrinenko.
 */
public class Profession {
    public String surname;              // фамилия
    public String name;                 // имя
    public int age;                     // возраст
    public String city;                 // город проживания
    public int workExperience;          // опыт работы
    public static int countProf = 0;    // количество созданных экземпляров класса

    /**
     * Конструктор для объекта Profession.
     * Без параметров.
     */
    public Profession() {
        countProf++;
        this.surname = "Doe " + countProf;
        this.name = "John";
        this.age = 20;
        this.city = "New York";
        this.workExperience = 0;
    }

    /**
     * Конструктор для объекта Profession.
     * Используем конструктор родительского класса Profession.
     *
     * @param surname фамилия.
     * @param name имя.
     * @param city город проживания.
     * @param age возраст.
     * @param workExperience опыт работы.
     */
    public Profession(String surname, String name, int age, String city, int workExperience) {
        countProf++;
        this.surname = surname + " " + countProf;
        this.name = name;
        this.age = age;
        this.city = city;
        this.workExperience = workExperience;
    }

    /**
     * Метод presentation.
     * Вывод на печать имени, возраста и города проживания.
     */
    public void presentation() {
        System.out.println("My name is " + name + ", I'm " + age + " years old, from " + city);
    }
}
