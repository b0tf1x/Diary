package michachail.marks.controller;

import lombok.RequiredArgsConstructor;
import michachail.marks.dto.MarksDto;
import michachail.marks.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequestMapping(path = "/marks")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class MarksController {
    private final MarksService marksService;
    @GetMapping("/{studentId}")
    public List<MarksDto> getMarksByStudent(@PathVariable long studentId){
        return marksService.getMarksByStudentId(studentId);
    }
    @GetMapping
    public List<MarksDto> getMarksByStudentAndGroup(@RequestParam String name, @RequestParam long group){
        return marksService.getMarksByStudentAndGroup(name,group);
    }
}
