package ru.job4j;

/**
 * Class Students.
 * Класс, описывающий поведение студента.
 *
 * @autor alavrinenko.
 */
public class Students extends Profession{
    private int kurs;           // курс, на котором учится студент
    private boolean isIll;      // признак - болеет студент или нет
    private Teacher kurator;    // учитель, являющийся куратором студента

    /**
     * Конструктор для объекта Студент.
     *
     * @param kurs - курс, на котором учится студент.
     * @param isIll - признак здоровья студента.
     * @param teacher - куратор у студента.
     */
    public Students(String surname, int kurs, boolean isIll, Teacher teacher) {
        this.surname = surname;
        this.kurs = kurs;
        this.isIll = isIll;
        this.kurator = teacher;
    }

    /**
     * Метод illness.
     * Если студент болен и у доктора есть пилюльки - то студент выздоравливает.
     * Если нет - то по-прежнему болеет.
     * После лечения у доктора становится на пилюльку меньше - издержки лечения.
     *
     * @param doctor доктор, который проводит лечение.
     * @return boolean value - признак, здоров или нет студент.
     */
    public boolean illness(Doctor doctor) {
        if(this.isIll && doctor.getPills() > 0) {
            doctor.medication();
            this.isIll = false;
        }
        return this.isIll;
    }

    /**
     * Метод getKurator.
     * Возвращает экземляр класса учителя, являющегося куратором у данного студента.
     *
     * @return Teacher value.
     */
    public Teacher getKurator() {
        return kurator;
    }

    /**
     * Метод changeCurator.
     * Меняем куратора у студента, если предыдущий куратор и новый не один и тот же учитель.
     *
     * @param teacher строка для вывода в консоль (str).
     */
    public void changeCurator(Teacher teacher) {
        if (!teacher.equals(getKurator())) {
            this.kurator = teacher;
        }
    }
}
