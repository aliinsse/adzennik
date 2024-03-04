package start.data_entities;

import java.time.LocalDate;

public class Grade {
    int id;
    int studentId;
    // int teacherId;
    int subjectId;
    LocalDate date;

    public Grade(){
        this.id = 0;
        this.studentId = 0;
        this.subjectId = 0;
        this.date = LocalDate.of(2000, 1, 1);

    }
}
