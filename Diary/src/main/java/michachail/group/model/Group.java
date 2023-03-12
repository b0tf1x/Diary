package michachail.group.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import michachail.schedule.model.Schedule;

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
    @JoinColumn(name = "shedule_id_shedule")
    private Schedule schedule;
}
