package michachail.student.storage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import michachail.student.dto.StudentDto;
import michachail.student.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select student from Student student " +
            "where student.group.group_number = ?1")
    List<StudentDto> findStudentsByGroup(long groupId);
}
