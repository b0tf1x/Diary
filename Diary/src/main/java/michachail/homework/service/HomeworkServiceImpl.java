package michachail.homework.service;

import lombok.RequiredArgsConstructor;
import michachail.exceptions.NotFoundException;
import michachail.homework.dto.HomeworkDto;
import michachail.homework.mapper.HomeworkMapper;
import michachail.homework.model.Homework;
import michachail.homework.storage.HomeworkRepository;
import michachail.student.model.Student;
import michachail.student.storage.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HomeworkServiceImpl implements HomeworkService {
    private final HomeworkRepository homeworkRepository;
    private final StudentRepository studentRepository;

    @Override
    public List<HomeworkDto> getHomeworkByStudent(long studentId) {
        studentRepository.findById(studentId).orElseThrow(()->{
            throw new NotFoundException("Студент не найден");
        });
        return homeworkRepository.getHomeworkByStudent(studentId)
                .stream()
                .map(HomeworkMapper::toHomeworkDto)
                .collect(Collectors.toList());
    }
    @Override
    public List<HomeworkDto>getHomeworkByStudentAndGroup(String name, long group){
        Student student = studentRepository.findStudentByNameAndGroup(name,group).orElseThrow(()->{
            throw new NotFoundException("Студент не найден");
        });
        return getHomeworkByStudent(student.getId_student());
    }
    @Transactional
    @Override
    public HomeworkDto create(long studentId, HomeworkDto homeworkDto){
        studentRepository.findById(studentId).orElseThrow(()->{
            throw new NotFoundException("Студент не найден");
        });
        Homework homework = homeworkRepository.save(HomeworkMapper.toHomework(homeworkDto));
        return HomeworkMapper.toHomeworkDto(homework);
    }
}
