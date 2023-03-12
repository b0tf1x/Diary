package michachail.notes.service;

import michachail.notes.dto.NotesDto;

public interface NotesService {
NotesDto create(long studentId, NotesDto notesDto);
}
