package michachail.shedule.service;

import lombok.RequiredArgsConstructor;
import michachail.shedule.storage.SheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import michachail.shedule.dto.SheduleDto;
import michachail.shedule.mapper.SheduleMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class SheduleServiceImpl implements SheduleService{
    private final SheduleRepository sheduleRepository;
    @Override
    public List<SheduleDto> findSheduleByWeekAndGroup(long groupNum, long weekNum){
        return sheduleRepository.findSheduleByWeekAndGroup(groupNum, weekNum)
                .stream().map(SheduleMapper::toSheduleDto).collect(Collectors.toList());
    }
}
