package michachail.student.service;

import lombok.extern.slf4j.Slf4j;
import michachail.exceptions.NotFoundException;
import lombok.RequiredArgsConstructor;
import michachail.student.dto.StudentDto;
import michachail.student.mapper.StudentMapper;
import michachail.student.model.Student;
import michachail.student.storage.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Slf4j
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public List<StudentDto> findStudentsByGroup(long groupId) {
        return studentRepository.findStudentsByGroup(groupId);
    }

    @Override
    public StudentDto findStudentById(long studentId) {
        Student student = studentRepository.findById(studentId).orElseThrow(() -> {
            throw new NotFoundException("Студент не найден");
        });
        return StudentMapper.toStudentDto(student);
    }
    public StudentDto findStudentByNameAndGroup(String name, long group){
        Student student = studentRepository.findStudentByNameAndGroup(name,group).orElseThrow(()->{
                throw new NotFoundException("Студент не найден");
        });
        return StudentMapper.toStudentDto(student);
    }
    @Override
    public StudentDto create(StudentDto studentDto){
        log.info("crate");
        Student student = studentRepository.save(StudentMapper.toStudent(studentDto));
        return StudentMapper.toStudentDto(student);
    }
}
