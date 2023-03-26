package michachail.homework.storage;

import michachail.homework.dto.HomeworkDto;
import michachail.homework.model.Homework;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HomeworkRepository extends JpaRepository<Homework, Long> {
    @Query("select homework from Homework homework " +
            "where homework.student.id_student = ?1")
   List<Homework> getHomeworkByStudent(long studentId);
    @Query("select homework from Homework homework " +
            "where homework.student.full_name = ?1 " +
            "and homework.student.group.group_number = ?2")
    List<Homework>getHomeworkByStudentAndGroup(String name, long group);
    @Modifying
    @Query("delete from Homework homework " +
            "where homework.student.id_student = ?1 ")
    void deleteForStudent(long studentId);
}
