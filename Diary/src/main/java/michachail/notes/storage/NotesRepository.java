package michachail.notes.storage;

import michachail.notes.model.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NotesRepository extends JpaRepository<Notes, Long> {
    @Query("select notes from Notes notes " +
            "where notes.student.id_student = ?1")
    List<Notes> findByStudentId(long studentId);
    @Modifying
    @Query("delete from Notes notes " +
            "where notes.student.id_student = ?1 ")
    void deleteAllByStudentId_student(long studentId);
}
