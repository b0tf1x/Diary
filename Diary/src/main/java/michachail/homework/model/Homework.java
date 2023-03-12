package michachail.homework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import michachail.student.model.Student;
import michachail.subject.model.Subject;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "homework")
public class Homework {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_homework;
    private String content;
    private LocalDateTime deadline;
    private String status;
    @ManyToOne
    @JoinColumn(name = "subject_id_subject")
    private Subject subject;
    @ManyToOne
    @JoinColumn(name = "student_id_student")
    private Student student;
}
