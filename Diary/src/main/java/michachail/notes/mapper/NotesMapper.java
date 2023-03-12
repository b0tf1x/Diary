package michachail.notes.mapper;

import michachail.notes.dto.NotesDto;
import michachail.notes.model.Notes;

public class NotesMapper {
    public static Notes toNotes(NotesDto notesDto){
        return new Notes(notesDto.getId(),
                notesDto.getContent(),
                notesDto.getStudent());
    }
    public static NotesDto toNotesDto(Notes notes){
        return new NotesDto(notes.getId(),
                notes.getContent(),
                notes.getStudent());
    }
}
