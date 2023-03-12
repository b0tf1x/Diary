package michachail.student.dto;

import michachail.group.model.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {
    private long id_student;
    private String full_name;
    private int course;
    private Group group;
}
