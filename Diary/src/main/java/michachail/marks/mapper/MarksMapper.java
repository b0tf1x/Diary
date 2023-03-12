package michachail.marks.mapper;

import michachail.marks.dto.MarksDto;
import michachail.marks.model.Marks;

public class MarksMapper {
    public static Marks toMarks(MarksDto marksDto) {
        return new Marks(marksDto.getId_marks(),
                marksDto.getCurrent_control(),
                marksDto.getCreative_rating(),
                marksDto.getScore(),
                marksDto.getExam(),
                marksDto.getSubject(),
                marksDto.getStudent());
    }

    public static MarksDto toMarksDto(Marks marks) {
        return new MarksDto(marks.getId_marks(),
                marks.getCurrent_control(),
                marks.getCreative_rating(),
                marks.getScore(),
                marks.getExam(),
                marks.getSubject(),
                marks.getStudent());
    }
}
