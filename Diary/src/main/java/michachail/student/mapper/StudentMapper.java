package michachail.student.mapper;

import michachail.student.dto.StudentDto;
import michachail.student.model.Student;

public class StudentMapper {
    public static Student toStudent(StudentDto studentDto) {
        return new Student(
                studentDto.getId_student(),
                studentDto.getFull_name(),
                studentDto.getCourse(),
                studentDto.getGroup()
        );
    }

    public static StudentDto toStudentDto(Student student) {
        return new StudentDto(
                student.getId_student(),
                student.getFull_name(),
                student.getCourse(),
                student.getGroup()
        );
    }
}
