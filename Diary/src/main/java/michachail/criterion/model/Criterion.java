package michachail.criterion.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import michachail.marks.model.Marks;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "criterion")
public class Criterion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String points;
    @ManyToOne
    @JoinColumn(name="marks_id_marks")
    private Marks mark;
}
