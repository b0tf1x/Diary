package michachail.schedule.dto;

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
public class ScheduleDto {
    private long id_schedule;
    private LocalDateTime date_schedule;
    private int week_number;
    private int lesson_number;
    private String teacher;
    private Subject subject;
    private Classroom classroom;
    private Group group;
}
