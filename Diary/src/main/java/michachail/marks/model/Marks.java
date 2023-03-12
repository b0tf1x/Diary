package michachail.marks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import michachail.student.model.Student;
import michachail.subject.model.Subject;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "marks")
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_marks;
    private long current_control;
    private long creative_rating;
    private long score;
    private long exam;
    @ManyToOne
    @JoinColumn(name = "subject_id_subject")
    private Subject subject;
    @ManyToOne
    @JoinColumn(name = "student_id_student")
    private Student student;
}
