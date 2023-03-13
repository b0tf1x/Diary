package michachail.notes.controller;

import lombok.RequiredArgsConstructor;
import michachail.notes.dto.NotesDto;
import michachail.notes.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notes")
@RequiredArgsConstructor
public class NotesController {
    private final NotesService notesService;
    @GetMapping("/{studentId}")
    public NotesDto getByStudentId(@PathVariable long studentId){
        return notesService.getByStudentId(studentId);
    }
    @PostMapping("/{studentId}")
    public NotesDto create(@PathVariable long studentId, @RequestBody NotesDto notesDto){
        return notesService.create(studentId,notesDto);
    }
}
