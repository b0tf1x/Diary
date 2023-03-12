package michachail.marks.storage;

import michachail.marks.model.Marks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarksRepository extends JpaRepository<Marks, Long> {
}
