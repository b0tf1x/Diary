package michachail.shedule.storage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import michachail.shedule.model.Shedule;

import java.util.List;
@Repository
public interface SheduleRepository extends JpaRepository<Shedule, Long> {
    @Query("select shedule from Shedule shedule " +
            "where shedule.week_number = ?2 " +
            "and shedule.group.group_number = ?1")
    List<Shedule> findSheduleByWeekAndGroup(long groupNum, long weekNum);
}
