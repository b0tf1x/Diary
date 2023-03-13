package michachail.notes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import michachail.student.model.Student;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotesDto {
    private long id;
    private String content;
    private long studentId;
}
