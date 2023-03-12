package michachail.criterion.storage;

import michachail.criterion.model.Criterion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CriterionRepository extends JpaRepository<Criterion, Long> {
}
