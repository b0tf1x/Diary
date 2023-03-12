package michachail.shedule.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import michachail.shedule.dto.SheduleDto;
import michachail.shedule.service.SheduleService;

import java.util.List;

@RestController
@RequestMapping("/shedule")
@RequiredArgsConstructor
@Slf4j
public class SheduleController {
    private final SheduleService sheduleService;

    @GetMapping("/{groupNum}/weekNum")
    public List<SheduleDto> findSheduleByGroupAndWeek(@PathVariable long groupNum,
                                                      @RequestParam long weekNum) {
        return sheduleService.findSheduleByWeekAndGroup(groupNum, weekNum);
    }
}
