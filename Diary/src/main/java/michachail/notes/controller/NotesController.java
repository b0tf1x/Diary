package michachail.notes.controller;

import lombok.RequiredArgsConstructor;
import michachail.notes.dto.NotesDto;
import michachail.notes.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping(path = "/notes")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class NotesController {
    private final NotesService notesService;
    @PostMapping("/{studentId}")
    public NotesDto create(@PathVariable long studentId, @RequestBody NotesDto notesDto){
        return notesService.create(studentId,notesDto);
    }
}
