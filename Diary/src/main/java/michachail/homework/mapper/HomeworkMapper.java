package michachail.homework.mapper;

import michachail.homework.dto.HomeworkDto;
import michachail.homework.model.Homework;

public class HomeworkMapper {
    public static Homework toHomework(HomeworkDto homeworkDto) {
        return new Homework(homeworkDto.getId_homework(),
                homeworkDto.getContent(),
                homeworkDto.getDeadline(),
                homeworkDto.getStatus(),
                homeworkDto.getSubject(),
                homeworkDto.getStudent());
    }
    public static HomeworkDto toHomeworkDto(Homework homework) {
        return new HomeworkDto(homework.getId_homework(),
                homework.getContent(),
                homework.getDeadline(),
                homework.getStatus(),
                homework.getSubject(),
                homework.getStudent());
    }
}
