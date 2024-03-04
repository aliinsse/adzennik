package start.data_entities;

import java.time.LocalDate;

public class Homework {
    int id;
    LocalDate date;
    int subjectId;
    int classId;
    String data;

    public Homework(){
        this.id = 0;
        this.date = LocalDate.of(2000, 1, 1);
        this.subjectId = 0;
        this.classId = 0;
        this.data = "";

    }
}
