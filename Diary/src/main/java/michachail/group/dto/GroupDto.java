package michachail.group.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import michachail.schedule.model.Schedule;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroupDto {
    private long group_number;
    private String speciality;
    private Schedule schedule;
}
