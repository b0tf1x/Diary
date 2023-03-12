package michachail.student.service;

import michachail.student.dto.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> findStudentsByGroup(long userId);
    StudentDto findStudentById(long studentId);
    StudentDto findStudentByNameAndGroup(String name, long group);
    StudentDto create(StudentDto studentDto);
}
