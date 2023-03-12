package michachail.group.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import michachail.shedule.model.Shedule;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long group_number;
    private String speciality;
    @ManyToOne
    @JoinColumn(name = "group_group_number")
    private Shedule shedule;
}
