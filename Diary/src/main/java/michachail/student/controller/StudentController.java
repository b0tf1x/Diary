package michachail.student.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import michachail.student.dto.StudentDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        log.warn("Поиск студентов по группе");
        return studentService.findStudentsByGroup(groupId);
    }
    @GetMapping("/{studentId}")
    public StudentDto findStudentById(@PathVariable long studentId){
        log.warn("Поиск по айди студента");
        return studentService.findStudentById(studentId);
    }
    @GetMapping
    public StudentDto findStudentByNameAndGroup(@RequestParam String name, @RequestParam long group){
        log.warn("Поиск по имени и группе");
        return studentService.findStudentByNameAndGroup(name,group);
    }
    @PostMapping
    public StudentDto create(@RequestBody StudentDto studentDto){
        log.warn("Создание пользователя");
        return studentService.create(studentDto);
    }
}
