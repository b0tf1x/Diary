package michachail.notes.mapper;

import michachail.notes.dto.NotesDto;
import michachail.notes.model.Notes;
import michachail.student.model.Student;

public class NotesMapper {
    public static Notes toNotes(NotesDto notesDto, Student student){
        return new Notes(notesDto.getId(),
                notesDto.getContent(),
                student);
    }
    public static NotesDto toNotesDto(Notes notes){
        return new NotesDto(notes.getId(),
                notes.getContent(),
                notes.getStudent().getId_student());
    }
}
