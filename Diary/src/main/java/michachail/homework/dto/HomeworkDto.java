package michachail.homework.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import michachail.student.model.Student;
import michachail.subject.model.Subject;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class HomeworkDto {
    private long id_homework;
    private String content;
    private LocalDateTime deadline;
    private String status;
    private Long subject;
    private long student;
}
