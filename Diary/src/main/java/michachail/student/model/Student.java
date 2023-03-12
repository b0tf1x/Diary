package michachail.student.model;

import michachail.group.model.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_student;
    private String full_name;
    private int course;
    @ManyToOne
    @JoinColumn(name = "group_group_number")
    private Group group;
}
