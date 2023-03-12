package michachail.subject.storage;

import org.springframework.data.jpa.repository.JpaRepository;
import michachail.subject.model.Subject;

public interface SubjectsRepository extends JpaRepository<Subject, Long> {
}
