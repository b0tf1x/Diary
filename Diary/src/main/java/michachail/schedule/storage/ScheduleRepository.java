package michachail.schedule.storage;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import michachail.schedule.model.Schedule;

import java.util.List;
@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    @Query("select schedule from Schedule schedule " +
            "where schedule.week_number = ?2 " +
            "and schedule.group.group_number = ?1")
    List<Schedule> findScheduleByWeekAndGroup(long groupNum, long weekNum);
}
