package michachail.homework.controller;

import lombok.RequiredArgsConstructor;
import michachail.homework.dto.HomeworkDto;
import michachail.homework.service.HomeworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping(path = "/homework")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class HomeworkController {
    private final HomeworkService homeworkService;
    @GetMapping("/{studentId}")
    public List<HomeworkDto>getHomeworkByStudent(@PathVariable long studentId){
        return homeworkService.getHomeworkByStudent(studentId);
    }
    @GetMapping
    public List<HomeworkDto>getHomeworkByStudentAndGroup(@RequestParam String name,@RequestParam long group){
        return homeworkService.getHomeworkByStudentAndGroup(name, group);
    }
    @PostMapping("/{studentId}")
    public HomeworkDto create(@PathVariable long studentId, @RequestBody HomeworkDto homeworkDto){
        return homeworkService.create(studentId,homeworkDto);
    }
    @DeleteMapping("/{studentId}")
    public void deleteForStudent(@PathVariable long studentId){
        homeworkService.deleteForStudent(studentId);
    }
}
