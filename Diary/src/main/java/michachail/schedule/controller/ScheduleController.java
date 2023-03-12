package michachail.schedule.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import michachail.schedule.dto.ScheduleDto;
import michachail.schedule.service.ScheduleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
@Slf4j
public class ScheduleController {
    private final ScheduleService scheduleService;

    @GetMapping("/{groupNum}/weekNum")
    public List<ScheduleDto> findScheduleByGroupAndWeek(@PathVariable long groupNum,
                                                       @RequestParam long weekNum) {
        return scheduleService.findScheduleByWeekAndGroup(groupNum, weekNum);
    }
}
