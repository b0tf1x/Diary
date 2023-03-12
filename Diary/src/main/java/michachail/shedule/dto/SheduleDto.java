package michachail.shedule.dto;

import michachail.classroom.model.Classroom;
import michachail.group.model.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import michachail.subject.model.Subject;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class SheduleDto {
    private long id_shedule;
    private LocalDateTime date_shedule;
    private int week_number;
    private int lesson_number;
    private Subject subject;
    private Classroom classroom;
    private Group group;
}
