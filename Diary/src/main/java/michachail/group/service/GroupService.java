package michachail.group.service;

import michachail.group.dto.GroupDto;

import java.util.List;

public interface GroupService {
    List<GroupDto> findAll();
    GroupDto findGroupById(long groupId);
    GroupDto create(GroupDto groupDto);
}
