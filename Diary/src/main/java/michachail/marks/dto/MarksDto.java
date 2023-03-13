package michachail.marks.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import michachail.student.model.Student;
import michachail.subject.model.Subject;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarksDto {
    private long id_marks;
    private long attendance;
    private long current_control;
    private long creative_rating;
    private long score;
    private long exam;
    private Subject subject;
    private Student student;
}
