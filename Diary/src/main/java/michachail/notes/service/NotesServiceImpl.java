package michachail.notes.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import michachail.exceptions.NotFoundException;
import michachail.notes.dto.NotesDto;
import michachail.notes.mapper.NotesMapper;
import michachail.notes.model.Notes;
import michachail.notes.storage.NotesRepository;
import michachail.student.model.Student;
import michachail.student.storage.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
@Slf4j
@Transactional
public class NotesServiceImpl implements NotesService {
    private final NotesRepository notesRepository;
    private final StudentRepository studentRepository;
    @Override
    public NotesDto create(long studentId, NotesDto notesDto) {
        log.info("studentId = "+studentId);
        Student student = studentRepository.findStudentById(studentId).orElseThrow(() -> {
            throw new NotFoundException("Студент не найден "+studentId);
        });
        Notes notes = notesRepository.save(NotesMapper.toNotes(notesDto,student));
        return NotesMapper.toNotesDto(notes);
    }
    @Override
    public List<NotesDto> getByStudentId(long studentId){
        studentRepository.findStudentById(studentId).orElseThrow(() -> {
            throw new NotFoundException("Студент не найден "+studentId);
        });
        List<Notes> notes = notesRepository.findByStudentId(studentId);
        return notes.stream()
                .map(NotesMapper::toNotesDto)
                .collect(Collectors.toList());
    }
    @Override
    @Transactional
    public void deleteAllForStudent(long studentId){
        notesRepository.deleteAllByStudentId_student(studentId);
    }
}
