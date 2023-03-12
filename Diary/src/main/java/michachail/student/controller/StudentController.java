package michachail.student.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import michachail.student.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import michachail.student.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
@Slf4j
public class StudentController {
    private final StudentService studentService;

    @GetMapping("/group/{groupId}")
    public List<StudentDto> findStudentsByGroup(@PathVariable long groupId){
        return studentService.findStudentsByGroup(groupId);
    }
    @GetMapping("/{studentId}")
    public StudentDto findStudentById(@PathVariable long studentId){
        return studentService.findStudentById(studentId);
    }

}
