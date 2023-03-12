package michachail.marks.storage;

import michachail.marks.dto.MarksDto;
import michachail.marks.model.Marks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MarksRepository extends JpaRepository<Marks, Long> {
    @Query("select marks from Marks marks " +
            "where marks.student.id_student = ?1")
    List<Marks> getMarksByStudentId(long studentId);
    @Query("select marks from Marks marks " +
            "where marks.student.full_name =?1 " +
            "and marks.student.group.group_number = ?2 ")
    List<Marks> getMarksByStudentAndGroup(String name, long group);
}
