package ru.job4j;

/**
 * Class Doctor.
 * Класс, описывающий поведение врача.
 *
 * @autor alavrinenko.
 */
public class Doctor extends Profession {
    private int pills = 5;      // количество таблеток у врача

    /**
     * Конструктор для объекта Врач.
     * Используем конструктор родительского класса Profession.
     *
     * @param surname фамилия.
     * @param name имя.
     * @param city город проживания.
     * @param age возраст.
     * @param workExperience опыт работы.
     */
    public Doctor(String surname, String name, String city, int age, int workExperience) {
        new Profession(surname,name,age,city,workExperience);
    }

    /**
     * Метод addNewPills.
     * Пополнение запаса лекарств у врача.
     *
     * @param doctor первый студент в группе.
     */
    public int addNewPills(Doctor doctor) {
        if (this.pills < 10) {
            this.pills = this.pills + 20;
        }
        return this.pills;
    }

    /**
     * Метод getPills.
     * Пополнение запаса лекарств у врача.
     *
     * @return int - количество таблеток у врача.
     */
    public int getPills() {
        return pills;
    }

    /**
     * Метод medication.
     * Уменьшение запаса лекарств у врача за счет лечения пациентов.
     *
     * @return int - количество таблеток у врача.
     */
    public int medication() {
        return this.pills > 0 ? this.pills - 1 : 0;
    }

    /**
     * Метод medicalInspection.
     * Прохождение медосмотра Инженером у Врача.
     * Если Инженер нужндается в медосмотре и есть пилюльки у Врача - то медосмотр проходится успешно.
     *
     * @return boolean - пройден медосмотр или нет (false - пройден, true - нет).
     */
    public boolean medicalInspection(Engineer engineer) {
        boolean medicalCheck = true;
        if (engineer.getIsMedicalCheck() && this.pills > 0) {
            engineer.setMedicalCheck(true);
            this.pills = (this.pills - 1) > 0 ? (this.pills - 1) : 0;
            medicalCheck = false;
        }
        return medicalCheck;
    }
}
                 