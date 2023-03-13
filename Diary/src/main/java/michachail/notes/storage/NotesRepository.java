package michachail.notes.storage;

import michachail.notes.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface NotesRepository extends JpaRepository<Notes, Long> {
    @Query("select notes from Notes notes " +
            "where notes.student.id_student = ?1")
    Notes findByStudentId(long studentId);
}
