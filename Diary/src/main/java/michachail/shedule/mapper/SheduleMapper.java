package michachail.shedule.mapper;

import michachail.shedule.dto.SheduleDto;
import michachail.shedule.model.Shedule;

public class SheduleMapper {
    public static SheduleDto toSheduleDto(Shedule shedule){
        return new SheduleDto(
                shedule.getId_shedule(),
                shedule.getDate_shedule(),
                shedule.getWeek_number(),
                shedule.getLesson_number(),
                shedule.getSubject(),
                shedule.getClassroom(),
                shedule.getGroup()
        );
    }
    public static Shedule toShedule(SheduleDto sheduleDto){
        return new Shedule(
                sheduleDto.getId_shedule(),
                sheduleDto.getDate_shedule(),
                sheduleDto.getWeek_number(),
                sheduleDto.getLesson_number(),
                sheduleDto.getSubject(),
                sheduleDto.getClassroom(),
                sheduleDto.getGroup()
        );
    }
}
