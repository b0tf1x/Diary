package michachail.marks.service;

import lombok.RequiredArgsConstructor;
import michachail.exceptions.NotFoundException;
import michachail.marks.dto.MarksDto;
import michachail.marks.mapper.MarksMapper;
import michachail.marks.storage.MarksRepository;
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
public class MarksServiceImpl implements MarksService {
    private final MarksRepository marksRepository;
    private final StudentRepository studentRepository;

    @Override
    public List<MarksDto> getMarksByStudentId(long studentId) {
        studentRepository.findById(studentId).orElseThrow(()->{
            throw new NotFoundException("Студент не найден");
        });
        return marksRepository.getMarksByStudentId(studentId)
                .stream()
                .map(MarksMapper::toMarksDto)
                .collect(Collectors.toList());
    }

    @Override
    public List<MarksDto> getMarksByStudentAndGroup(String name, long group) {
        Student student = studentRepository.findStudentByNameAndGroup(name,group).orElseThrow(()->{
            throw new NotFoundException("Студент не найден");
        });
        return getMarksByStudentId(student.getId_student());
    }
}
