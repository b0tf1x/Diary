package michachail.homework.storage;

import michachail.homework.model.Homework;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeworkRepository extends JpaRepository<Homework, Long> {
}
