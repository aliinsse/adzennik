package start.data_entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Message {
    int id;
    int studentId;
    int chatId;
    LocalDateTime sendTime;

    public Message() {
        this.id = 0;
        this.studentId = 0;
        this.chatId = 0;
        this.sendTime = LocalDateTime.of(2000, 1,1,0,0);

    }
}
