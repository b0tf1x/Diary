package michachail.homework.service;

import michachail.homework.dto.HomeworkDto;

import java.util.List;

public interface HomeworkService {
    List<HomeworkDto> getHomeworkByStudent(long studentId);
    List<HomeworkDto>getHomeworkByStudentAndGroup(String name, long group);
    HomeworkDto create(long studentId, HomeworkDto homeworkDto);
    void deleteForStudent(long studentId);
}
