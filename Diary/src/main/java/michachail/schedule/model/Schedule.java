package michachail.schedule.model;

import michachail.classroom.model.Classroom;
import michachail.group.model.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import michachail.subject.model.Subject;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "schedule")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_schedule;
    private LocalDateTime date_schedule;
    private int week_number;
    private int lesson_number;
    private String teacher;
    @ManyToOne
    @JoinColumn(name = "subject_id_subject")
    private Subject subject;
    @ManyToOne
    @JoinColumn(name = "classroom_id_classroom")
    private Classroom classroom;
    @ManyToOne
    @JoinColumn(name = "group_group_number")
    private Group group;
}
