package start.data_entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Student {
    int id;
    String name; // Имя
    String surname; // Фамилия
    String patronymic; // Отчество

    LocalDate dayOfBirth;

    String parent1;
    int phoneNumber1;

    String parent2;
    int phoneNumber2;

    public Student(){
        this.id = 0;
        this.name = "";
        this.surname = "";
        this.patronymic = "";
        this.dayOfBirth = LocalDate.of(2000, 1, 1);
        this.parent1 = "";
        this.parent2 = "";
        this.phoneNumber1 = 0;
        this.phoneNumber2 = 0;

    }
}
