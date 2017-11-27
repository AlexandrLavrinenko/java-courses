package ru.job4j;

public class Engineer extends Profession {
    private boolean hardSkills;     // Признак - может ли Инженер ремонтировать сложное оборудование (у Врача)
    private boolean isMedicalCheck; // Признак необходимости прохождения медицинского осмотра у Врача.

    /**
     * Конструктор для объекта Инженер.
     * Используем конструктор родительского класса Profession.
     *
     * @param surname        фамилия.
     * @param name           имя.
     * @param city           город проживания.
     * @param age            возраст.
     * @param hardSkills     признак наличия возможности починки сложного оборудования (у Врача).
     * @param isMedicalCheck признак необходимости прохождения медицинского осмотра у Врача.
     */
    public Engineer(String surname, String name, String city, int age, boolean hardSkills, boolean isMedicalCheck) {
        int workExperience = 1;
        new Profession(surname, name, age, city, workExperience);
        this.hardSkills = hardSkills;
        this.isMedicalCheck = isMedicalCheck;
    }

    /**
     * Метод repairOfEquipment.
     * Починка мед.оборудования у Врача.
     *
     * @return boolean - отремонтировано оборудования или нет.
     */
    public boolean repairOfEquipment(Doctor doctor) {
        boolean equipmentRepair = false;
        if (this.hardSkills) {
            equipmentRepair = true;
        }
        return equipmentRepair;
    }

    /**
     * Метод testingEquipment.
     * Эффективность осмотра мед.оборудования у Врача.
     * Если есть необходимый скилл - то успешно.
     * Если возраст Инженера более 30 лет и опыт работы у Врача более 5 лет - то успешно.
     * В других случаях - неуспешно.
     *
     * @return boolean - эффективность осмотра оборудования у конкретного Врача.
     */
    public boolean testingEquipment(Doctor doctor) {
        boolean testEquipment = false;
        if (this.hardSkills) {
            testEquipment = true;
        } else if (this.age > 30 && doctor.workExperience > 5) {
            testEquipment = true;
        }
        return testEquipment;
    }

    public boolean getIsMedicalCheck() {
        return isMedicalCheck;
    }

    public void setMedicalCheck(boolean medicalCheck) {
        isMedicalCheck = medicalCheck;
    }
}

 