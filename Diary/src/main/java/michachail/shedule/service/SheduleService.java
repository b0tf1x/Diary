package michachail.shedule.service;

import michachail.shedule.dto.SheduleDto;

import java.util.List;
public interface SheduleService {
 List<SheduleDto> findSheduleByWeekAndGroup(long groupNum, long weekNum);
}
