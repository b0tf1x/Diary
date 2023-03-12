package michachail.marks.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private long score;
    private long final_mark;

}
