package michachail.shedule.model;

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
@Table(name = "shedule")
public class Shedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_shedule;
    private LocalDateTime date_shedule;
    private int week_number;
    private int lesson_number;
    @ManyToOne
    @JoinColumn(name = "subject_id_subject")
    private Subject subject;
    @ManyToOne
    @JoinColumn(name = "classroom_id_classroom")
    private Classroom classroom;
    @ManyToOne
    @JoinColumn(name = "shedule_id_shedule")
    private Group group;
}
