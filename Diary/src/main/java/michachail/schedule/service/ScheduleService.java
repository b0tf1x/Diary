package michachail.schedule.service;

import michachail.schedule.dto.ScheduleDto;

import java.util.List;

public interface ScheduleService {
    List<ScheduleDto> findScheduleByWeekAndGroup(long groupNum, long weekNum);
}
