package michachail.group.mapper;

import michachail.group.dto.GroupDto;
import michachail.group.model.Group;

public class GroupMapper {
    public static Group toGroup(GroupDto groupDto) {
        return new Group(
                groupDto.getGroup_number(),
                groupDto.getSpeciality(),
                groupDto.getSchedule()
        );
    }

    public static GroupDto toGroupDto(Group group) {
        return new GroupDto(
                group.getGroup_number(),
                group.getSpeciality(),
                group.getSchedule()
        );
    }
}
