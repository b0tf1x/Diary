package michachail.schedule.service;

import lombok.RequiredArgsConstructor;
import michachail.schedule.dto.ScheduleDto;
import michachail.schedule.mapper.ScheduleMapper;
import michachail.schedule.storage.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class ScheduleServiceImpl implements ScheduleService {
    private final ScheduleRepository scheduleRepository;

    @Override
    public List<ScheduleDto> findScheduleByWeekAndGroup(long groupNum, long weekNum) {
        return scheduleRepository.findScheduleByWeekAndGroup(groupNum, weekNum)
                .stream().
                map(ScheduleMapper::toSheduleDto).
                collect(Collectors.toList());
    }
}
