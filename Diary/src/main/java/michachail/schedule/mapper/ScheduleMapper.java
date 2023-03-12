package michachail.schedule.mapper;

import michachail.schedule.dto.ScheduleDto;
import michachail.schedule.model.Schedule;

public class ScheduleMapper {
    public static ScheduleDto toSheduleDto(Schedule schedule) {
        return new ScheduleDto(
                schedule.getId_schedule(),
                schedule.getDate_schedule(),
                schedule.getWeek_number(),
                schedule.getLesson_number(),
                schedule.getTeacher(),
                schedule.getSubject(),
                schedule.getClassroom(),
                schedule.getGroup()
        );
    }

    public static Schedule toShedule(ScheduleDto sheduleDto) {
        return new Schedule(
                sheduleDto.getId_schedule(),
                sheduleDto.getDate_schedule(),
                sheduleDto.getWeek_number(),
                sheduleDto.getLesson_number(),
                sheduleDto.getTeacher(),
                sheduleDto.getSubject(),
                sheduleDto.getClassroom(),
                sheduleDto.getGroup()
        );
    }
}
