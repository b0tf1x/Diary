package michachail.notes.service;

import michachail.notes.dto.NotesDto;

import java.util.List;

public interface NotesService {
NotesDto create(long studentId, NotesDto notesDto);
List<NotesDto> getByStudentId(long studentId);
void deleteAllForStudent(long studentId);
}
