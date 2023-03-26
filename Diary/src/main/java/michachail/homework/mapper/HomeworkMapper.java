package michachail.homework.mapper;

import michachail.homework.dto.HomeworkDto;
import michachail.homework.model.Homework;
import michachail.student.model.Student;
import michachail.subject.model.Subject;

public class HomeworkMapper {
    public static Homework toHomework(HomeworkDto homeworkDto, Student student) {
        return new Homework(homeworkDto.getId_homework(),
                homeworkDto.getContent(),
                homeworkDto.getDeadline(),
                homeworkDto.getStatus(),
                new Subject(),
                student);
    }
    public static HomeworkDto toHomeworkDto(Homework homework) {
        return new HomeworkDto(homework.getId_homework(),
                homework.getContent(),
                homework.getDeadline(),
                homework.getStatus(),
                1L,
                homework.getStudent().getId_student());
    }
}
