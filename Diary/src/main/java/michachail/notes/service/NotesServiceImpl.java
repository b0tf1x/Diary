package michachail.notes.service;

import lombok.RequiredArgsConstructor;
import michachail.exceptions.NotFoundException;
import michachail.notes.dto.NotesDto;
import michachail.notes.mapper.NotesMapper;
import michachail.notes.model.Notes;
import michachail.notes.storage.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class NotesServiceImpl implements NotesService {
    private final NotesRepository notesRepository;
    @Transactional
    @Override
    public NotesDto create(long studentId, NotesDto notesDto) {
        notesRepository.findById(studentId).orElseThrow(() -> {
            throw new NotFoundException("Студент не найден");
        });
        Notes notes = notesRepository.save(NotesMapper.toNotes(notesDto));
        return NotesMapper.toNotesDto(notes);
    }
}
