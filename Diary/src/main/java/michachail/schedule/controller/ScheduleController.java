package michachail.schedule.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import michachail.schedule.dto.ScheduleDto;
import michachail.schedule.service.ScheduleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ScheduleController {
    private final ScheduleService scheduleService;

    @GetMapping
    public List<ScheduleDto> findScheduleByGroupAndWeek(@RequestParam long groupId,
                                                       @RequestParam int weekNumber) {
        return scheduleService.findScheduleByWeekAndGroup(groupId, weekNumber);
    }
}
