package michachail.student.storage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import michachail.student.dto.StudentDto;
import michachail.student.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Query("select student from Student student " +
            "where student.group.group_number = ?1")
    List<StudentDto> findStudentsByGroup(long groupId);
    @Query("select student from Student student " +
            "where student.full_name = ?1 " +
            "and student.group.group_number = ?2")
    Optional<Student> findStudentByNameAndGroup(String name, long group);
}
